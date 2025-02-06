package assignment1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class SampleError {
	
	
	public static double getAbsoluteError(double av, double ev) {
		double absError= Math.abs(av-ev);
		return absError;
		}
	
	
	public static double getRelativeError(double av,double ev) {
		double relError = Math.abs(av-ev)/av;
		return relError;
	}
	
	public static double getPercentageError(double av,double ev) {
		double percentError= (Math.abs(av-ev)/av)*100;
		return percentError;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter absolute value: ");
		double av =sc.nextDouble();
		
		
		SampleError se = new SampleError();
		
		String pattern="###.000";
        DecimalFormat df=new DecimalFormat(pattern);
		
		
		if(av!=0) {
			System.out.println("Enter expected value: ");
			double ev=sc.nextDouble();
			System.out.printf("Absolute error is: " +df.format(se.getAbsoluteError(av, ev)));
			System.out.printf("\nRelative error is: "+df.format(se.getRelativeError(av, ev)));
			if(se.getPercentageError(av, ev)>1)
				System.out.printf("\nPercentage error is:"+df.format(se.getPercentageError(av, ev)));
			else
				System.out.println("Percentage value is less than 1..cannot display it!");
	
		}
		else {
			System.out.println("Enter non-zero value");
			System.exit(0);
		}

	}

}
