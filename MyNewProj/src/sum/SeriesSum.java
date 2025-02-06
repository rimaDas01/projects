package sum;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int n = sc.nextInt();
		while ( i <= n) {
			sum = sum + i;
			i=i+2;
		}
		System.out.print("Sum is = ");
	    System.out.print(sum);
		
	}

}
