package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {

	
	public static void main(String[] args) {
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		VoterCard vc = new VoterCard();
		vc.setName("gajendra");
		vc.setVid(2);
		Person p = new Person();
		p.setPid(3);
		p.setName("gajendra");
		p.setVoterCard(vc);
		
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		VoterCard vCard=entityManager.find(VoterCard.class, 2);
		System.out.println(vCard.getPerson().getPid());
	//entityManager.persist(p);
	
	entityTransaction.commit();
		System.out.println("record update");
		
	} catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
	}
}