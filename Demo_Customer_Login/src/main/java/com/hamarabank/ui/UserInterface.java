package com.hamarabank.ui;

import com.hamarabank.controller.DemoCustomerLoginController;
import com.hamarabank.dto.CustomerLoginDTO;

public class UserInterface 
{
    public static void main( String[] args ) throws Exception {
    	try {
			CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
			customerLoginDTO.setLoginName("Rima");
			customerLoginDTO.setPassword("test123");
			
			DemoCustomerLoginController customerLoginController = new DemoCustomerLoginController();
			String message = customerLoginController.authenticateCustomer(customerLoginDTO);
			System.out.println("Message "+message);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
