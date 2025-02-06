package clonning;

class Book implements Cloneable{

	private Integer bookId;
	private String title, author;
	private double price;  
	
	public Book() {}

	public Book(Integer bookId,String title, String author, Double price) {
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
		return "Book [Book Id=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	
	//clone() method is overridden here its return type is object
	public Object clone() throws CloneNotSupportedException{
		Book book = new Book(this.bookId,this.title,this.author,this.price);
		return book;
	}
	
	
}

public class ClonningEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Book book = new Book(111,"Phyics","Kalam",1900.0);
//		Book newBook = (Book)book.clone(); //deep cloning
//		System.out.println(newBook);
		Book newBook =book;  //shallow cloning
		System.out.println(newBook);  
		

	}

}
