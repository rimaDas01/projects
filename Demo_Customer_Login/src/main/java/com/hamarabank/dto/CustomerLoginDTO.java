package com.hamarabank.dto;

public class CustomerLoginDTO {
	private String loginName;
	private String password;
	
	public CustomerLoginDTO () {}
	
	public CustomerLoginDTO(String loginName, String password) {
		this.loginName = loginName;
		this.password =  password;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return "Name:" +loginName+ "Password: "+password+ "" ;
	}
}
