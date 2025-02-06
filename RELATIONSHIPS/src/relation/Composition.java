package relation;

class Book{
	private String title;
	private Double price;
	
	//inner class
	class Author{
		private String name;
		private Long contactNumber;
		private String email;
		
		//constructors
		public Author(String name, Long contactNumber, String email) {
			super();
			this.name = name;
			this.contactNumber = contactNumber;
			this.email=email;
		}
		
		//getters-setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(Long contactNumber) {
			this.contactNumber = contactNumber;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		//toString
		@Override
		public String toString() {
			return "Author [name=" + name + ", contactNumber=" + contactNumber + ", email=" + email + "]";
		}	
	}
	
	//constructors of book class
		public Book(){}
		public Book(String title, Double price ) {
			super();
			this.title = title;
			this.price =price ;
		}
		//getters-setters
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		//toString
		@Override
		public String toString() {
			return "Book [title=" + title + ",price=" + price + "]";
		}
}

public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("Physics",1000.0 );
		System.out.println(book);
		
		//inner class object
		Book.Author author = book.new Author("Dr. Robert", 989009889L, "robertpattinson@gamil.com");
		System.out.println(author);
	}

}
