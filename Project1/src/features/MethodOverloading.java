package features;

class Greeting{
	void greet() {
		System.out.println("Hello");
	}
	void greet(String name) {
		System.out.println("Hello "+name);
	}
	void greet(String name,int age) {
		System.out.println("Hello "+name);
		System.out.println("Age: "+age);
	}
	void greet(String name,String city,int age) {
		System.out.println("Hello "+name);
		System.out.println("I am from "+city);
		System.out.println("Age: "+age);

	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting g = new Greeting();
		g.greet("Roger","Las Vegas",90);
		

	}

}
