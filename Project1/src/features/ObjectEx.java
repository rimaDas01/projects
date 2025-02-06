package features;


class Book{
	String title;
	double price;
	String author;
	int book_id;
	
	//Constructor - default
	Book(){
		title=author=null;
		price=0.0;
		book_id=0;
	}
	
	//Parameterized Constructor
	Book(String title, double price,String author,int book_id){
		this.title =title;
		this.price=price;
		this.author=author;
		this.book_id=book_id;
	}
	
	void showBookDetails() {
		System.out.println(title+" "+price+" "+author+" "+book_id);
	}
	
//	void initBookDetails(String t, double p, String a) {
//		t=title;
//		p=price;
//		a=author;
//	}
}

public class ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1,book2,book3;
		book1 = new Book("Physics", 1000.0, "Dr. Kalam",1001);
		book2 = new Book("Computers", 1200d, "Dr. Kanetkar",1008);
		book3 = new Book(null, 0.0, null,0);

		
		
//		Book book1 = new Book();
//		Book book2 = new Book();
//		Book book3 = new Book();
		
		//accessing members of class using references
//        book1.title="Physics";
//        book1.price=1000.0;
//        book1.author="Dr. Kalam";
//
//        book1.initBookDetails("Physics", 1000.0, "Dr. Kalam");

//        book2.title="Computers";
//        book2.price=1200d;
//        book2.author="Dr. Kanetkar";
//        book2.initBookDetails("Computers", 1200d, "Dr. Kanetkar");

//        book3.title=null;
//        book3.price=0.0;
//        book3.author=null;
//        book3.initBookDetails(null, 0.0, null);


        //System.out.println(book1.title+" "+book1.price+" "+book1.author);
        //System.out.println(book2.title+" "+book2.price+" "+book2.author);

        book1.showBookDetails();
        book2.showBookDetails();
        book3.showBookDetails();
	}

}
