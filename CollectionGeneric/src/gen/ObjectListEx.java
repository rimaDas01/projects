package gen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Book{
	private String title;
	private double price;
	
	Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
}

public class ObjectListEx {
	
	List<Book>bookList=new ArrayList<>();
	
	public void addBook(Book book) {
		bookList.add(book);
		System.out.println("Book added!");
	}
	
	public void showAllBooks() {
//		System.out.println("Books available are:\n"+bookList);
//		System.out.println(bookList);
		
		Iterator<Book>it=bookList.iterator();
		System.out.println("Book details are:");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	 public void deleteBook(String title) {
//		 bookList.remove(0);
//		 System.out.println("Book removed");
		 boolean deleted=false;
		Iterator<Book>it=bookList.iterator();
		while(it.hasNext()) {
			Book book=it.next();
			if(book.getTitle().equalsIgnoreCase(title)) {
				it.remove();
				deleted=true;
			}	
		}
		if(deleted)
			System.out.println("Book deleted!");
		else
			System.out.println("Book not found");

		 
	    }
	 
	 public void editBook(String title, double price) {
	        //code to find book with specified title and change its price
		 boolean edited=false;
		 Iterator<Book>it=bookList.iterator();
		 while(it.hasNext()) {
			 Book book =it.next();
			 if (book.getTitle()==title) {
				 book.setPrice(price);
				edited=true;
			 }
		 }	 
		 if(edited)
			 System.out.println("Successfully edited.");
		 else
			 System.out.println("Edit not successful.");
	 }
	 
	 public void searchBook(String title) {
	        //code to display all the books with specified title and display their details
		 
		 Iterator<Book>it=bookList.iterator();
		 boolean found=false;
		 while(it.hasNext()) {
			 
	           Book book1=it.next();
	           if(book1.getTitle().equalsIgnoreCase(title)) {
	        	   found=true;
	               System.out.println("Book details are: "+book1.toString());   
	           }
		 }
		 if(found)
			 System.out.println("Book found");
	     else
	          System.out.println("Book not present list ");
	    
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ObjectListEx ex=new ObjectListEx();
		
		/*Book b1,b2;
		
		b1= new Book();
		b1.setPrice(1200);
		b1.setTitle("C++");
		
		b2=new Book();
		b2.setPrice(900.78);
		b2.setTitle("Java");
		
		ex.addBook(b1);
		ex.addBook(b2);
		ex.showAllBooks();*/
		
		Book[]books=new Book[3];
		books[0]=new Book("C++",123.78);
		books[1]=new Book("Java",5908.90);
		books[2]=new Book("Python",2000);
		
		
		
		do {
		System.out.println("Enter your choice\n1 for add\n2 for show all books\n3 for delete a book\n4 for editing book details\n5 to search book from list");		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1: 
			for(Book book: books)
				ex.addBook(book);
			break;
		case 2:
			ex.showAllBooks();
			break;
		case 3:
//			ex.deleteBook("Hello");
			ex.deleteBook("Java");
			break;
			
		case 4:	
			ex.editBook("Java", 7900);
			break;
		
		case 5:
			ex.searchBook("Maths");
			break;
		default:
			System.out.println("Wrong choice!!");

		}
		}while(true);

	}
}
