package com.ustglobal.praticeapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.praticeapp.dto.Mobile;

public class ReadMobile {

	public static void main(String[] args) {
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		
		try {
			EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			//entityTransaction=entityManager.getTransaction();
			
			
			Mobile productData= entityManager.find(Mobile.class, 1);
			System.out.println("Id is -->"+productData.getNum());
			System.out.println("Name  -->"+productData.getModel());
			System.out.println("Quantity is -->"+productData.getName());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
