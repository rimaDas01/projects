package excep;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException{
	public InvalidAgeException() {
		}
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class CustomeExceptionEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		name= sc.nextLine();
		System.out.println("Enter age: ");
		age=sc.nextInt();
		try {
		if(age<18)
			throw new InvalidAgeException("You are not eligible to cast votes! ");
		else
			 System.out.println("Welcome, "+name+" you can cast your valuable vote");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close(); //close statements

	}

}
