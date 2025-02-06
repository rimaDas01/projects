package orm_mapping.bi_onetoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ProductImpl {
	
	EntityManagerFactory emf=null;
    EntityManager em=null;

    public ProductImpl() {
        emf=Persistence.createEntityManagerFactory("mapping");
        em=emf.createEntityManager();
    }

    public void getAll() {
        TypedQuery<Product>query= em.createQuery("select p from Product p",Product.class);
        List<Product>list=query.getResultList();
        if(list.isEmpty())
            System.out.println("No record found");
        else
            System.out.println(list);
    }
	public void insert(Product product) {
        em.getTransaction().begin();
        em.persist(product);
        em.getTransaction().commit();
        System.out.println("record saved");
    }

}
