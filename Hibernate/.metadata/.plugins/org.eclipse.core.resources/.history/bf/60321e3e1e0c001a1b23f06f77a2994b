package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class DeleteDemo {

	
	public static void main(String[] args) {
		
		EntityManager em= null;
		EntityTransaction et=null;
		
		try {
			
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			Product productData= em.find(Product.class, 1);
			em.remove(productData);
			
			System.out.println("Delete  Record");
			et.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}
}
