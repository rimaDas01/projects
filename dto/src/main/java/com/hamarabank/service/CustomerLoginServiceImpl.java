package com.hamarabank.service;



import com.hamarabank.dto.CustomerLoginDTO;
import com.hamarabank.exception.HamaraBankException;
import com.hamarabank.repository.CustomerLoginRepository;
import com.hamarabank.repository.CustomerLoginRepositoryImpl;



public class CustomerLoginServiceImpl implements CustomerLoginService{
    
    private CustomerLoginRepository customerLoginRepository;
     
    public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws HamaraBankException {
        String toReturn = null;
        customerLoginRepository = new CustomerLoginRepositoryImpl();
        CustomerLoginDTO customerLoginFromRepository =
                customerLoginRepository.getCustomerLoginByLoginName(customerLoginDTO.getLoginName());
        if (customerLoginDTO.getPassword().equals(customerLoginFromRepository.getPassword())) {
            toReturn = "SUCCESS";
        } else {
            throw new HamaraBankException("Service.WRONG_CREDENTIALS");
        }
        return toReturn;



}
}