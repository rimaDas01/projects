package com.mybank.ui;

import java.text.DecimalFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mybank.bean.BillCalculator;
import com.mybank.configuration.SpringConfiguration;

//main class(user interface class) 
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Configuration class is invoked
		 ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		 
		 //Spring's Application Context initializes the beans by calling getBean method
	        BillCalculator bill = (BillCalculator) applicationContext.getBean(BillCalculator.class);
	        
	        String pattern="##.0";
	        DecimalFormat df=new DecimalFormat(pattern);
	        
	        //Bean class(BillCalculator) method is called
		 System.out.println("Total bill to pay is $"+(df.format(bill.calculateBill())));
	}

}
