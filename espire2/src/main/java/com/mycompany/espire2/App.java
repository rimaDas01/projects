package com.mycompany.espire2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
    	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
    	 Employee employee=(Employee)context.getBean("employee");
    	 employee.display();    
    	 }
}
