package com.ustglobal.jpawithhibernateapp.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
public class PencilBox {

	@Id
	private int bid;
	private String bname;
	@Exclude
	@OneToMany(mappedBy ="pencilBox")
	private List<Pencil> pencil;
}
