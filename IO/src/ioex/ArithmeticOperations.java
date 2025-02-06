package ioex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
//		Scanner sc= new Scanner(System.in);
		
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		System.out.println("Enter a: ");
		Integer a= Integer.parseInt(bfr.readLine());
		System.out.println("Enter b: ");
		Float b= Float.parseFloat(bfr.readLine());
		
		System.out.println("Add "+(a+b));
		System.out.println("Sub "+(a-b));
		System.out.println("Mul "+(a*b));
		System.out.println("Div "+(a/b));
		System.out.println("Modulus "+a%b);

	}

}
