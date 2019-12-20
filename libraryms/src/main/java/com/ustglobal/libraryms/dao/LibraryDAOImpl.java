package com.ustglobal.libraryms.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.libraryms.dto.Book;
import com.ustglobal.libraryms.dto.BookRegister;
import com.ustglobal.libraryms.dto.User;


@Repository
public class LibraryDAOImpl implements LibraryDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public User login(String email, String password) {
		String jpql = "from User where email=:email and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<User> query = manager.createQuery(jpql, User.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			User user = query.getSingleResult();
			return user;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public User registerUser(User user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(user);
			transaction.commit();
			return user;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	
	@Override
	public List<Book> showAllBooks() {
		String jpql = "from Book";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Book> query = manager.createQuery(jpql, Book.class);
		List<Book> booksDetails = query.getResultList();
		return booksDetails;

	}

	@Override
	public User getStudentInfo(int id) {
		EntityManager manager = factory.createEntityManager();
		User bean = manager.find(User.class, id);
		return bean;

	}

	@Override
	public boolean deleteStudent(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User bean = manager.find(User.class, id);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Book addBooks(Book booksDetails) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(booksDetails);
			transaction.commit();
			return booksDetails;
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	@Override
	public boolean deleteBook(int bid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Book bean = manager.find(Book.class, bid);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		} else {
			transaction.rollback();
			return false;
		}
	}

	@Override
	public List<BookRegister> viewRequest() {
		
		return null;
	}

	


	@Override
	public Book searchBook(String bookName) {
		EntityManager manager = factory.createEntityManager();
		Book bean = manager.find(Book.class, bookName);
		return bean;
	}
	@Override
	public boolean updateBook(Book bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Book bookBean = manager.find(Book.class, bean.getBid());
		bookBean.setBookName(bean.getBookName());
		bookBean.setAuthor1(bean.getAuthor1());
		bookBean.setAuthor2(bean.getAuthor2());
		bookBean.setPublisher(bean.getPublisher());
		bookBean.setYearOfPublication(bean.getYearOfPublication());
		transaction.commit();		
		transaction.rollback();
		return true;
	}

	@Override
	public int requestBook(int bid, int sno) {
		

		return 0;
	}

	@Override
	public List<User> ShowAllUser() {
		String jpql="from User";
		EntityManager manager= factory.createEntityManager();
		//TypedQuery<User> query =manager.createQuery(jpql , User.class);
		TypedQuery<User> query = manager.createQuery(jpql, User.class);
		List<User> user = query.getResultList(); 
		return user;
	}

	@Override
	public boolean request(int sid, int bid) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
//			Date d = new Date();
			Book book = manager.find(Book.class, bid);
			User user = manager.find(User.class, sid);
			BookRegister issue = new BookRegister();
			issue.setUser(user);
			issue.setBookbean(book);
//			issue.setIssueDate(d);
			//issue.setStatus("request");
			manager.persist(issue); 	
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean respond(int bid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			
			BookRegister issue =  manager.find(BookRegister.class, bid);
			//issue.setReturnDate(service.returnDate());
			//issue.setStatus("accept");
			manager.persist(issue);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean deleteRespond(int bid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookRegister issue =  manager.find(BookRegister.class, bid);
			manager.remove(issue);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public List<BookRegister> getResponse() {
		// TODO Auto-generated method stub
		String jpql = "from BookIssue";
		EntityManager manager = factory.createEntityManager();
		try {
			TypedQuery<BookRegister> book = manager.createQuery(jpql, BookRegister.class);
			List<BookRegister> lbook = book.getResultList();
			return lbook;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
