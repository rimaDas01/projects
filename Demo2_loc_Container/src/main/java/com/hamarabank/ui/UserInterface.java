package com.hamarabank.ui;
 
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hamarabank.bean.GreetingBean;
//import com.hamarabank.bean.WelcomeBean;
import com.hamarabank.configuration.SpringConfig;
 
public class UserInterface {

    public static void main(String[] args) {
 
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        //welcome bean class
//        WelcomeBean welcomeBean = (WelcomeBean) applicationContext.getBean(WelcomeBean.class);
//        System.out.println(welcomeBean.printWelcome());
        
        //greeting bean class
        GreetingBean greetingBean =(GreetingBean) applicationContext.getBean(GreetingBean.class);
        System.out.println(greetingBean.sayHello());
    }
}