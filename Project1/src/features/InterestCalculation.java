package features;

import java.util.Scanner;

public class InterestCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		double P = sc.nextDouble();
		System.out.println("Enter rate of interest: ");
		int r = sc.nextInt();
		System.out.println("Enter time: ");
		double t=sc.nextDouble();
		
		double SI = P*r*t/100;
		System.out.println("Simple Interest is = Rs. "+SI);
		
//		double CI = P-P(1+r/100)^t;
	}

}
