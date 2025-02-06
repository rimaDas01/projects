package com.mycompany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf;
    	emf=Persistence.createEntityManagerFactory("jpaex");
    	
    	EntityManager em;
    	em= emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	Book book = new Book(6, "DBMS", "James", 1000.0);
    	em.persist(book);
    	System.out.println("Object saved");
    	
    	em.getTransaction().commit();
    }
}
