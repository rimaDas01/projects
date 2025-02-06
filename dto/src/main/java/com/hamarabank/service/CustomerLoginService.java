package com.hamarabank.service;



import com.hamarabank.dto.CustomerLoginDTO;
import com.hamarabank.exception.HamaraBankException;



public interface CustomerLoginService {
    public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws HamaraBankException;
 }