package com.ustglobal.libraryms.servie;

import java.util.List;


import com.ustglobal.libraryms.dto.Book;
import com.ustglobal.libraryms.dto.BookRegister;
import com.ustglobal.libraryms.dto.User;

public interface LibraryService {
	
	public User login(String email, String password);
	public User registerUser(User user);
	public Book addBooks(Book booksDetails);
	public List<Book> showAllBooks();
	public List<User> ShowAllUser();
	public int requestBook(int bid, int sno);
	public boolean deleteBook(int bid);
	Book  searchBook(String bookName);
	
	public boolean request(int sid, int bid);
	public boolean respond(int bid);
	public boolean deleteRespond(int bid);
	public List<BookRegister> getResponse();
	
	public boolean deleteStudent(int id);
	public User getStudentInfo(int id);
	public boolean updateBook(Book bean);

}
