package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class InsertQuery {

	
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager=entityManagerFactory.createEntityManager();
			 entityTransaction=entityManager.getTransaction();
					entityTransaction.begin();
		
					
			String jpql="INSERT INTO Product (pid, pname, pquantity) VALUES (:id , :name, :quantity) ";
			Query query= entityManager.createNativeQuery(jpql);
			
			query.setParameter("id", "3");
			query.setParameter("name", "Pencil");
			query.setParameter("quantity", "5");
			  
			int result=query.executeUpdate();
			System.out.println("insert record  "+result);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		
	}
}
