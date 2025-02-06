package practice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine().toLowerCase();
		boolean isPalindrome=true;
		
		for(int i =0,j=str.length()-1; i <j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}

	}

}
