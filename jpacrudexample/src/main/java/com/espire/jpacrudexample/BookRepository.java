package com.espire.jpacrudexample;



import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

//	List<Book> findByTitleorPrice(String title,Double price);
	
	/*@Query("update Book b set b.price=:price where b.isbn=:isbn")
	@Modifying
	@Transactional
	Integer updateBookPrice(@Param("price")Double updateBookByPrice,@Param("isbn") Integer isbn);
	
	@Query("select b from Book b where b.isbn=:isbn")
	Book findBookByIsbn(@Param("isbn")Integer isbn);*/
	
	String findTitleByIsbn(@Param("isbn")Integer isbn);
}