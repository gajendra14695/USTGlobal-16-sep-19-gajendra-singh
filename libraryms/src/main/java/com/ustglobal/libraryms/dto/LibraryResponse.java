package com.ustglobal.libraryms.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ustglobal.libraryms.dto.Book;
import com.ustglobal.libraryms.dto.User;

import lombok.Data;

@Component
@Data
public class LibraryResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<User> user;
	private List<Book> booksDetails;

}
