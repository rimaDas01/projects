package com.hamarabank.repository;

import com.hamarabank.dto.CustomerLoginDTO;

public interface CustomerLoginRepository {
	public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);
}
