package com.espire.jpacrudexample;



import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JpacrudexampleApplication implements CommandLineRunner {
    
    @Autowired
    BookRepository bookRepository;



   public static void main(String[] args) {
        SpringApplication.run(JpacrudexampleApplication.class, args);
    }



   @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        Book book ;
     //   insert operation
//        book = new Book(7, "DBMS", "OGh.Prt", 12000.0);
//        bookRepository.save(book);
//        System.out.println("Object saved");
        
        //find operation
//        Optional<Book> optional = bookRepository.findById(9);
//        if(optional.isEmpty())
//            throw new Exception("Book not found");
//        book=optional.get();
//        System.out.println(book);
        
        //edit operation
//        Optional<Book> optional=bookRepository.findById(7);
//        if(optional.isEmpty())
//        	throw new Exception("Book not found");
//        book=optional.get();
//        book.setPrice(2000.0);
//        bookRepository.save(book);
//        System.out.println("object updated");
        
        //delete operation
//        bookRepository.deleteById(7);
//        System.out.println("object deleted");
        
 //       Integer n=bookRepository.updateBookPrice(1500.0,7);
   //     		System.out.println(n); //restriction that return type of dml query is int or void only
        
//        Book book1=bookRepository.findBookByIsbn(7);
//        System.out.println(book1);
        
        String title=bookRepository.findTitleByIsbn(7);
        System.out.println(title);
   }

}