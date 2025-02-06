package com.hamarabank.configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hamarabank.bean.GreetingBean;

//Annotations used
@Configuration
@ComponentScan(basePackages = "com.hamarabank.bean")

public class SpringConfig {
	
		@Bean
		public GreetingBean greetingBean() {
		String user=null;
		try {
			System.out.println("Enter user name");
			user=new BufferedReader(new InputStreamReader(System.in)).readLine();
		} 
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return new GreetingBean(user);
		}
		
}
