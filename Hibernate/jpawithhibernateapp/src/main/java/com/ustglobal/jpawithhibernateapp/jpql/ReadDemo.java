package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
//		
//		String jpql="from Product";
//		
//		Query query=entityManager.createQuery(jpql);
//		 
//	
//	List<Product> product=query.getResultList();
//	for (Product product2 : product) {
//		System.out.println(product2.getPid());
//		System.out.println(product2.getPname());
//		System.out.println(product2.getPquantity());
//		System.out.println("====================");
//	}
	
	
	System.out.println("=====================================================");
	
	String jpql="select pname from Product";
	
	Query query=entityManager.createQuery(jpql);
	List<String> product= query.getResultList();
	
	for (String product2 : product) {
		System.out.println(product2);

		System.out.println("====================");
	}
	
	}//end of the main method
}//end of the class ReadDemo
