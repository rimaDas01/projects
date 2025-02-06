package home;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	private int age;
	private String name;
	
	InvalidAgeException(){}
	InvalidAgeException(String displayMessage){
		super(displayMessage);
		}
}

public class CustomAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InvalidAgeException ex = new InvalidAgeException();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try {
			
			if(age<18) 
					throw new InvalidAgeException("You are not eligible to vote!");
			else
				System.out.println("Please vote");			
			
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Carry on....");
		}

	}

}
