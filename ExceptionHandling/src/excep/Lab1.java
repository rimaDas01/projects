package excep;

import java.util.Scanner;
import static java.lang.Math.sqrt;

class NegativeNumberException extends Exception{
	public NegativeNumberException () {
		
	}

	public NegativeNumberException (String msg) {
		super(msg);
	}
}

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number: ");
		int x= sc.nextInt();
		
		try{
			if(x<0) {
			throw new NegativeNumberException("Try for another positive number");
		}
		else {
			System.out.println("Root is: "+sqrt(x));
		}
		}catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
		}

	}

}
