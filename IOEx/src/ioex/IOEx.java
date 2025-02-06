package ioex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr1=new InputStreamReader(System.in);
		BufferedReader bfr1 = new BufferedReader(isr1);
		System.out.println("Enter name: ");
		String name=bfr1.readLine();
//		System.out.println("Good night "+name);

		InputStreamReader isr2= new InputStreamReader(System.in);
		BufferedReader bfr2= new BufferedReader(isr2);
		System.out.println("Enter charge: ");
		Integer units=bfr2.read();
		
		InputStreamReader isr3= new InputStreamReader(System.in);
		BufferedReader bfr3= new BufferedReader(isr3);
		System.out.println("Enter charge per unit: ");
		Double chargePerUnit= Double.parseDouble(bfr3.readLine());
		
		System.out.println("Electricity consumed by "+name+" is "+(units*chargePerUnit));
	}

}
