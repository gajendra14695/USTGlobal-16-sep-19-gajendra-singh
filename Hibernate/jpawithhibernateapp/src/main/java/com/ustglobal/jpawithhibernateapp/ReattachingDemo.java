package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReattachingDemo {


	public static void main(String[] args) {

		EntityManager entityManager =null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");

			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();

			Product productData= entityManager.find(Product.class, 3);
			System.out.println(entityManager.contains(productData));
			entityManager.detach(productData);
			System.out.println(entityManager.contains(productData));
			Product productData2=entityManager.merge(productData);
			//entityManager.clear();
			productData2.setPname("Watch");
			System.out.println("record Updates");
			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}

	}
}
