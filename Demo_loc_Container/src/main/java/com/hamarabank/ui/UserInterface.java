package com.hamarabank.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hamarabank.bean.DateBean;
import com.hamarabank.bean.MathBean;
import com.hamarabank.bean.WelcomeBean;
import com.hamarabank.configuration.SpringConfig;

public class UserInterface {

	public static void main(String[] args) {

		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringConfig.class);
		WelcomeBean welcomeBean = applicationContext.getBean(WelcomeBean.class);
		System.out.println(welcomeBean.printWelcome());
		
		DateBean dateBean = (DateBean)applicationContext.getBean(DateBean.class);
//		System.out.println(dateBean.getDate());
	
		MathBean mathBean = (MathBean)applicationContext.getBean(MathBean.class);
		System.out.println(mathBean);
		
		
	}

}
