package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");//it store the record in the  data base 
		EntityManager em = emf.createEntityManager();
		
		Product productData= em.find(Product.class, 1);
		System.out.println("Id is -->"+productData.getPid());
		System.out.println("Name  -->"+productData.getPname());
		System.out.println("Quantity is -->"+productData.getPquantity());
		
		
	}
}
