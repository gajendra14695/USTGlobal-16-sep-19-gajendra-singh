package com.ustglobal.libraryms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ustglobal.libraryms.dto.Book;

import lombok.Data;
import lombok.ToString.Exclude;
@Entity
@Table(name = "user")
@Data
public class User {

	@Id	
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String name;
	@Column(unique = true)
	private String email;
	@Column
	private String password;
	@Column
	private String type;
	@Exclude
	@OneToMany(mappedBy = "user")
	private List<BookRegister> bookRegister;
}
