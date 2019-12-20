package com.ustglobal.libraryms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booktranction")
public class BookTranscation {
	@Id
	@Column
private int tid;
	
	@Column
private int sid;
	@Column
private String issueTime;
	@Column
private String returnTime;
}
