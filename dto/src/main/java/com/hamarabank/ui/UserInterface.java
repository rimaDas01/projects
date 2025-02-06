package com.hamarabank.ui;

import com.hamarabank.control.CustomerLoginController;
import com.hamarabank.dto.CustomerLoginDTO;

public class UserInterface {
     public static void main(String[] args) throws Exception {

    	 try {
                CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
                customerLoginDTO.setLoginName("Phoebe");
                customerLoginDTO.setPassword( "pheebs96");

                CustomerLoginController customerLoginController = new CustomerLoginController();
                String message = customerLoginController.authenticateCustomer(customerLoginDTO);
                System.out.println(message);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
}