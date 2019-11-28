package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
public class VoterCard {

	@Id
	@Column
	private int vid;
	@Column
	private String name;
	@Exclude
	@OneToOne(mappedBy="voterCard")
private Person person;

}
