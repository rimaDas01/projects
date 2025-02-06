package serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable{    //POJO(Plain Old java Object) CLASS
	private Integer bookId;
	private String title, author;
	private Double price;
//	private transient double price;  //price will not be serialized as its transient, we will get its default value, we will never get its actual assigned value
	
	public Book() {}

	public Book(Integer bookId, String title, String author, Double price) {
		super();
		this.bookId=bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	
	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [Book Id=" + bookId + ", Book name=" + title + ", author=" + author + ", price=" + price + "]";
	}

	
	
}

public class SerializationDeserializationEx {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Book book = new Book("Physics","APJ Abdul Kalam",9008.50);
		
		
		//SERIALIZATION
		FileOutputStream fos = new FileOutputStream("book.txt");//fos contains book.txt
		ObjectOutput oos = new ObjectOutputStream(fos);  //oos contains fos
		oos.writeObject(book);                             
		System.out.println("Object persisted or serialized!");
		
		//DESERIALIZATION
		System.out.println("Reading object from persistent form");
		FileInputStream fis = new FileInputStream("book.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Book newBook = (Book)ois.readObject();
		System.out.println(newBook); */
		
		Book[] books = new Book[3];         //Array of object
		books[0]= new Book(901,"Maths","SN Dey", 890.0);
		books[1]=new Book (907,"Chemistry","NCERT",900.50);
		books[2]=new Book(107,"C","HG Verma",1800.0);
		
		//serialize
		FileOutputStream fos = new FileOutputStream("book.txt");
		ObjectOutput oos = new ObjectOutputStream(fos);  //oos contains fos
		oos.writeObject(books);                             
		System.out.println("Object persisted or serialized!");
		
		//deserialize
		System.out.println("Reading object from persistent form");
		FileInputStream fis = new FileInputStream("book.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Book[] newBooks = (Book[])ois.readObject();

		for(Book b: newBooks)
			System.out.println("Books detaisls: "+b);
		
	}

}
