package features;

import java.util.Scanner;

public class SalaryOfEmployee {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("Enter name of the employee: ");
		name=s.next();
		double basic_sal;
		System.out.println("Enter basic salary: ");
		basic_sal = s.nextDouble();
		double da= 0.02*basic_sal;
		final int ta =2000;
		double hra=0.10*basic_sal;
		double gross = basic_sal+da+ta+hra;
		double pt = 0.10*gross;
		double pf = 0.25*gross;
		double net_sal = gross-pt-pf;
		System.out.println("da= "+da);
		System.out.println("hra= "+hra);
		System.out.println("The gross salary is = Rs. "+gross);
		System.out.println("pt= "+pt);
		System.out.println("pf= "+pf);
		System.out.println("The net salary is = Rs. "+net_sal);
	}
}
