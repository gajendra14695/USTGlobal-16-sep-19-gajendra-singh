package com.ustglobal.praticeapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.praticeapp.dto.Mobile;

public class DeleteMobile {
	
public static void main(String[] args) {
		
		EntityManager em= null;
		EntityTransaction et=null;
		
		try {
			
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			Mobile productData= em.find(Mobile.class, 105);
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
