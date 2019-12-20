package com.ustglobal.libraryms.servie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ustglobal.libraryms.dao.LibraryDAO;
import com.ustglobal.libraryms.dto.Book;
import com.ustglobal.libraryms.dto.BookRegister;
import com.ustglobal.libraryms.dto.User;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	private LibraryDAO dao;

	@Override
	public User login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public User registerUser(User user) {
		return dao.registerUser(user);
	}

	@Override
	public Book addBooks(Book booksDetails) {
		return dao.addBooks(booksDetails);
	}
	
	@Override
	public List<Book> showAllBooks() {
		return dao.showAllBooks();
	}

	@Override
	public boolean deleteBook(int bid) {
		return dao.deleteBook(bid);
	}

	@Override
	public boolean deleteStudent(int id) {
		return dao.deleteStudent(id);
	}

	@Override
	public Book searchBook(String bookName) {
		return dao.searchBook(bookName);
	}

	@Override
	public User getStudentInfo(int id) {
		return dao.getStudentInfo(id);
	}

	@Override
	public boolean updateBook(Book bean) {
	    return dao.updateBook(bean);
	}

	@Override
	public int requestBook(int bid, int sno) {
		
		return 0;
	}

	@Override
	public List<User> ShowAllUser() {
		
		return dao.ShowAllUser();
	}

	@Override
	public boolean request(int sid, int bid) {
		// TODO Auto-generated method stub
		return dao.request(sid, bid);
	}

	@Override
	public boolean respond(int bid) {
		// TODO Auto-generated method stub
		return dao.respond(bid);
		
	}

	@Override
	public boolean deleteRespond(int bid) {
		// TODO Auto-generated method stub
		return dao.deleteRespond(bid);
	}

	@Override
	public List<BookRegister> getResponse() {
		// TODO Auto-generated method stub
		return dao.getResponse();
	}

}