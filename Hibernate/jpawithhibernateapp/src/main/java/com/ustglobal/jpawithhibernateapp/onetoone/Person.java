package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="person")
public class Person {
	
	@Id
	private int pid;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vid")
	private VoterCard voterCard;
	
}
