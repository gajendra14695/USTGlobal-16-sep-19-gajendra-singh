package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetRefference {

		
	public static void main(String[] args) {
		
		
		EntityTransaction et=null;
		EntityManager em=null;
		
		try {
			
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");
			em= emf.createEntityManager();
			et= em.getTransaction();
			et.begin();
		//	Product productData= em.find(Product.class, 2);
			Product productData= em.getReference(Product.class, 3);
			
			
			
			
			System.out.println("Record Update ");
			System.out.println(" "+productData.getPname());
			System.out.println("Record Update "+productData.getPquantity());
			System.out.println("Record Update "+productData.getPid());
			et.commit();
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}
}
