package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class InsertDemo {

	
	public static void main(String[] args) {
		
	Product p =new Product();
		p.setPid(21);
		p.setPname("pen");
		p.setPquantity(20);
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");//it store the record in the  data base 
		EntityManager em = emf.createEntityManager();//it will connect with database;
		EntityTransaction et = em.getTransaction();//
		et.begin();
		em.persist(p);
		System.out.println(" Record Saved Succesfully");
		
		et.commit();
		em.close();
	}
}
