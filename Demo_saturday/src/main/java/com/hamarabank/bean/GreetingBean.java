package com.hamarabank.bean;

public class GreetingBean {
	private String userName;

	public GreetingBean(String userName) {
		this.userName=userName;
	}

	public String sayHello() {
		return "Hello "+userName;
	}

	public String sayHello(String userName) {
		return "Hello "+userName;
	}

}
