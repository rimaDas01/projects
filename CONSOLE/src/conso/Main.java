package conso;
//Console class is used to accept encrypted/masked user input

import java.io.Console;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Console console=System.console();
		//String text=console.readPassword();	
		char[]text=console.readPassword();	
		int number=Integer.parseInt(new String(text));
		System.out.println(number);	

	}

}


