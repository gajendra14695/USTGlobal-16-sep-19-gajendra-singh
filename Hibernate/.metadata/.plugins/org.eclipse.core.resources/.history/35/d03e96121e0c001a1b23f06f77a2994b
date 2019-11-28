package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class UpdateDemo {

	
	public static void main(String[] args) {
		
		EntityTransaction et=null;
		EntityManager em=null;
		
		try {
			
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");
			em= emf.createEntityManager();
			et= em.getTransaction();
			et.begin();
			Product productData= em.find(Product.class, 1);
			productData.setPname("NoteBook");
			
			System.out.println("Record Update ");
			et.commit();
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}
}
