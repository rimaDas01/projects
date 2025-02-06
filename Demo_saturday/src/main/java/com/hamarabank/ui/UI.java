package com.hamarabank.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hamarabank.bean.GreetingBean;
import com.hamarabank.configuration.SpringConfig;

public class UI {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		//WelcomeBean welcomeBean = (WelcomeBean) applicationContext.getBean(WelcomeBean.class);
		//WelcomeBean welcomeBean = (WelcomeBean) applicationContext.getBean("abcd");
		//System.out.println(welcomeBean.printWelcome());

		GreetingBean greetingBean=(GreetingBean)applicationContext.getBean(GreetingBean.class);
		System.out.println(greetingBean.sayHello());
		//System.out.println("Enter name");
		//System.out.println(greetingBean.sayHello(new Scanner(System.in).nextLine()));
		}
}
