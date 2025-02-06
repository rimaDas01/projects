package com.mycompany.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args ){
    	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
    			 Employee employee=(Employee)context.getBean("employee123");
    			 employee.display();
     }
}
