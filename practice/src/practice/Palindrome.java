package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt(); //121
		int rev=0;
		int i = num;
		while(i!=0) {
			int rem = i%10;
			rev = rem+rev*10;
			i = i/10;
		}
		if(num==rev) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}

	}

}
