package features;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		long phnno ;
		System.out.println("Enter your name: ");
		name= sc.nextLine();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Enter your 10-digit phone no.: ");
		phnno = sc.nextLong();
		System.out.println("Your details: ");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone No.: "+phnno);
	}

}
