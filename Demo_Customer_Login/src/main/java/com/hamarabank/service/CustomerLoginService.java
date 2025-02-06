package com.hamarabank.service;

import com.hamarabank.dto.CustomerLoginDTO;

public interface CustomerLoginService {
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO);
}
