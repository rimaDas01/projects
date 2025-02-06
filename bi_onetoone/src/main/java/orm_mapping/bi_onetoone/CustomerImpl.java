package orm_mapping.bi_onetoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class CustomerImpl {
	
	EntityManagerFactory emf=null;
    EntityManager em=null;

    public CustomerImpl() {
        emf=Persistence.createEntityManagerFactory("mapping");
        em=emf.createEntityManager();
    }

    public void getAll() {
        TypedQuery<Customer>query= em.createQuery("select c from Customer c",Customer.class);
        List<Customer>list=query.getResultList();
        if(list.isEmpty())
            System.out.println("No record found");
        else
            System.out.println(list);
    }
    
    public void insert(Customer customer) {
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
        System.out.println("record saved");
    }

}
