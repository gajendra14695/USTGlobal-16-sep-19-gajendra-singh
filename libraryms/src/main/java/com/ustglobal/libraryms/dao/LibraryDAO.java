package com.ustglobal.libraryms.dao;

import java.util.List;

import com.ustglobal.libraryms.dto.Book;
import com.ustglobal.libraryms.dto.BookRegister;
import com.ustglobal.libraryms.dto.User;

public interface LibraryDAO {

	public User login(String email, String password);

	public User registerUser(User user);

	public int requestBook(int bid, int sno);

	public List<Book> showAllBooks();
	public List<User> ShowAllUser();

	public User getStudentInfo(int id);

	public boolean deleteStudent(int id);

	public Book addBooks(Book booksDetails);

	public boolean deleteBook(int bid);

	public List<BookRegister> viewRequest();

	Book  searchBook(String bookName);
	public boolean request(int sid, int bid);
	public boolean respond(int bid);
	public boolean deleteRespond(int bid);
	public List<BookRegister> getResponse();
	
	public boolean updateBook(Book bean);
	

	

}
