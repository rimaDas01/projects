package com.mybank.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//bean class package is invoked by the help of annotation
@Configuration
@ComponentScan(basePackages = "com.mybank.bean")
public class SpringConfiguration {
	

}
