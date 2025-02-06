package com.hamarabank.bean;

public class GreetingBean {
	private String userName;
	
	public GreetingBean(String username) {
		this.userName=userName;
	}
	public String sayHello() {
		return "Hello "+userName;
	}

}
