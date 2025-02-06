package features;

import java.util.Scanner;

public class SumOf10Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the elements of Array: ");
		Scanner sc = new Scanner(System.in);
		int[]a = new int[10];
		double sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]= sc.nextInt(); 
			sum = sum+a[i];
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+sum/a.length);
	}

}
