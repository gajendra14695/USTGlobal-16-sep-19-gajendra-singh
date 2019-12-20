package com.ustglobal.libraryms.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Table(name="booksdetails")
@Data
public class Book {
	
	@Id
	@Column
	@GeneratedValue
	private int bid;
	@Column
	private String bookName;
	@Column
	private String author1;
	@Column
	private String author2;
	@Column
	private String publisher;
	@Column
	private String yearOfPublication;
	@Exclude
	@OneToMany(mappedBy = "bookbean")
	private List<BookRegister> bookregister;
	
}