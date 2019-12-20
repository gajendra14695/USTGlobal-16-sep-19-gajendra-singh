package com.ustglobal.libraryms.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="books_registration")
@Data
public class BookRegister {
	
		@Id
		@Column
		@GeneratedValue
		private int registrationId;
		@Column
		private Date registrationDate;
		@ManyToOne(cascade = CascadeType.PERSIST)
		@JoinColumn(name="id")
		private  User user;
		
		@ManyToOne(cascade = CascadeType.PERSIST)
		@JoinColumn(name="bid")
		private Book bookbean;

}
