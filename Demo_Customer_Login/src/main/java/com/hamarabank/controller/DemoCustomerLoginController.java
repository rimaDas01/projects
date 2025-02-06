package com.hamarabank.controller;

import com.hamarabank.dto.CustomerLoginDTO;
import com.hamarabank.service.CustomerLoginService;
import com.hamarabank.service.CustomerLoginServiceImpl;

public class DemoCustomerLoginController {
	
	public CustomerLoginService customerLoginService;
	
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) {
		customerLoginService = new CustomerLoginServiceImpl();
		return customerLoginService.authenticateCustomer(customerLoginDTO);
		
	}

}
