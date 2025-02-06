package com.hamarabank.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hamarabank.bean.DateBean;
import com.hamarabank.bean.MathBean;
import com.hamarabank.bean.WelcomeBean;

@Configuration
public class SpringConfig {
	 @Bean
	    public WelcomeBean welcomeBean() {
	        return new WelcomeBean();    //default name of bean will be "welcomeBean"
	    }

	 @Bean
	    public DateBean dateBean() {
	        return new DateBean();    //default name of bean will be "welcomeBean"
	    }
	 
	 @Bean
	 public MathBean mathBean() {
		 return new MathBean();
	 }
}
