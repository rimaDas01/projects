package com.hamarabank.service;

import com.hamarabank.dto.CustomerLoginDTO;
import com.hamarabank.repository.CustomerLoginRepository;
import com.hamarabank.repository.CustomerLoginRepositoryImpl;

public class CustomerLoginServiceImpl implements CustomerLoginService {
	
	private CustomerLoginRepository customerLoginRepository;
	
	@Override
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) {
		// TODO Auto-generated method stub
		String toReturn = null;
		customerLoginRepository = new CustomerLoginRepositoryImpl();
		CustomerLoginDTO customerLoginFromRepository = 
				customerLoginRepository.getCustomerLoginByLoginName(customerLoginDTO.getLoginName());
		
		if(customerLoginDTO.getPassword().equals(customerLoginFromRepository.getPassword())) {
			toReturn = "SUCCESS"; 
		}
		else {
			toReturn = "Service.WRONG_CREDENTIALS";
		}
		return toReturn;
	}

}
