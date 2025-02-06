package com.hamarabank.repository;

import java.util.HashMap;
import java.util.Map;

import com.hamarabank.dto.CustomerLoginDTO;

public class CustomerLoginRepositoryImpl implements CustomerLoginRepository{

	public CustomerLoginDTO getCustomerLoginByLoginName(String loginName) {
	
		Map<String, String> customerCredentials = new HashMap<String, String>();
		customerCredentials.put("Rima","test123");
		customerCredentials.put("Tisha", "test123");
		
		CustomerLoginDTO customerLogin = new CustomerLoginDTO();
		customerLogin.setLoginName(customerCredentials.get(loginName));
		customerLogin.setPassword(customerCredentials.get(loginName));
		return customerLogin;
	}
	
}
