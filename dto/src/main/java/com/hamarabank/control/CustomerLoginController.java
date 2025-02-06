package com.hamarabank.control;



import com.hamarabank.dto.CustomerLoginDTO;
import com.hamarabank.exception.HamaraBankException;
import com.hamarabank.service.CustomerLoginServiceImpl;
import com.hamarabank.service.CustomerLoginService;



public class CustomerLoginController {



    private CustomerLoginService customerLoginService;
     
        public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws HamaraBankException {
            customerLoginService=new CustomerLoginServiceImpl();
            return customerLoginService.authenticateCustomer(customerLoginDTO);
}
}