package assignment1;

import java.util.Scanner;

public class ArmstrongMain {


public static boolean isArmstrong(int n) {
        int temp,last,sum=0;
        temp=n;
        while(temp>0) {
            last=temp%10;
            sum=sum+(last*last*last);
            temp=temp/10;
        }
        if(sum==n) {
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
    	do {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(isArmstrong(num)) 
            System.out.println("Number is Armstrong");
        else 
            System.out.println("Number is not Armstrong");
    	}while(true);



   }



}