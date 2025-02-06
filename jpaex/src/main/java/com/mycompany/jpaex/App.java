package com.mycompany.jpaex;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpaex");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	em.persist(new Book(10,"C++","Bala",1200d));
    	System.out.println("Object saved");
    	em.getTransaction().commit();
    	em.close();
    	emf.close();
    }
}


/*
postgres=# create table book(isbn int primary key, title varchar(20), author varchar(30), price float);
CREATE TABLE
postgres=# insert into book values(101,'Java','Bala',1000),(102,'C','Kanetkar',1200),(103,'COBOL','Rajaraman',1300);
INSERT 0 3
postgres=# select*From book;
 isbn | title |  author   | price
------+-------+-----------+-------
  101 | Java  | Bala      |  1000
  102 | C     | Kanetkar  |  1200
  103 | COBOL | Rajaraman |  1300
*/