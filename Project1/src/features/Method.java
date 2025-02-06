package features;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String text = greet("Robert");  //method call
//		System.out.println(text);
//		greet(); //calling method 
		greet("Rima");
		
	}
	
	/* No arg, no return value
	static void greet() {   //method definition
	String username;
	username= "Tokyo";
	System.out.println("Hello "+username);
	*/
	
	//No arg, with return value
	/*static String greet() {
		String username;
		username ="LoLo";
		return "You are "+username;
	}
	*/
	
	//with arg, with return value
	/*static String greet(String username) {
		return "Hi "+username;
	}
	*/
	
	//with args, no return value
	static void greet(String username) {
		System.out.println("Yo "+username);
	}
	
}
