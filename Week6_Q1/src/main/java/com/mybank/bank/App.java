package com.mybank.bank;

import java.text.DecimalFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//main class
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//spring.xml file is invoked 
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		//down casting from object to string
        BillCalculator bill = (BillCalculator)context.getBean("bill");
        
        String pattern="##.0";
        DecimalFormat df=new DecimalFormat(pattern);
        
        //calling method of POJO class
        System.out.println("Total bill to pay is $"+(df.format(bill.calculateBill())));
        }
}
