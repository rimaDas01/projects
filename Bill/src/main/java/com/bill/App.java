package com.bill;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	//no of items
    	int n;
    	double sum =0;
    	
    	System.out.println("Enter the number of items you want to store: ");
    	n=sc.nextInt();
    	
    	if(n<0) {
    			System.out.println("Enter positive value for adding items");
    		App.main(args);
    	}
    	else {
    		String[] items=new String[n] ;
        	double[]price=new double[n];
        	double[]quantity=new double[n];
        	
    	for(int i=0;i<n;i++) {
    	//items
    	System.out.println("Enter item name: ");
    	items[i]=sc.next();
    	//price
    	 System.out.println("Enter price per unit of the item: ");
    	price[i]=sc.nextDouble();
    	if(price[i]<0) {
    		System.out.println("Enter positive price");
    	break;
    	}
    	//quantity
    	System.out.println("Enter quantity of the item: ");
    	quantity[i]=sc.nextDouble();
    	
    	if(quantity[i]<0) {
    		System.out.println("Enter positive quantity");
    		break;
    	}
    	
    	//total bill
    		if(quantity[i]!=0) {
    			sum=sum+(quantity[i]*price[i]);
    		}
    	}
    	

    	System.out.println("Total Bill= Rs. "+sum);  
    	
    	}
    }
}
