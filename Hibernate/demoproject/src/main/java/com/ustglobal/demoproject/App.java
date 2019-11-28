package com.ustglobal.demoproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s = new Student();
        s.setId(1);
        //s.setGender("male");
        s.setName("Gajendra Singh");
        s.setQuantity(204);
        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        
       // ServiceRegistry reg= new javax.imageio.spi.ServiceRegistry().ap
        
        SessionFactory factry= con.buildSessionFactory();
        
        Session session= factry.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.save(s);
        
        
        tx.commit();
        
    }
}
