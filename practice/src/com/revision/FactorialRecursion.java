package com.revision;

public class FactorialRecursion {
	
	public static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		System.out.println("Factorial of x is: "+ fact(x));

	}

}
