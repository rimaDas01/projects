package ioex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		System.out.println("Enter name: ");
		String name = bfr.readLine();
		System.out.println("Hello "+name);

	}

}
