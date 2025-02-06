package billsystem;

import java.util.Scanner;

public class BillMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		double sum = 0;
		double quantity=0;
		
		int n=0;
		System.out.println("Enter number of items you want to buy: ");
		n=sc.nextInt();
		do {
			
			System.out.println("Enter item name");
			String item=sc.next();
			
			System.out.println("Enter item price");
			double price=sc.nextDouble();
			
			System.out.println("Enter item quantity");
			 quantity=sc.nextDouble();
			
			sum=sum+(quantity*price);
			n--;
		} while (n>0);
		
//		while(n!=0);
		System.out.println("Total Bill is: "+sum);
	}

}
