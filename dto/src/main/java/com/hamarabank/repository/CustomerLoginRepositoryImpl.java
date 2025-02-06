//package com.hamarabank.repository;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import com.hamarabank.dto.CustomerLoginDTO;
//
//public class CustomerLoginRepositoryImpl implements CustomerLoginRepository {
//
//	public CustomerLoginDTO getCustomerLoginByLoginName(String loginName) {
//
//		Map<String,String>customerCredentials = new HashMap<String,String>();
//		customerCredentials.put("Rima", "rima97");
//		customerCredentials.put("Rohan", "rohan98");
//		customerCredentials.put("Sohini", "sohi95");
//		customerCredentials.put("Phoebe", "pheebs96");
//		customerCredentials.put("Ross", "ross87");
//		
//		CustomerLoginDTO customerLogin = new CustomerLoginDTO();
//		customerLogin.setLoginName(loginName);
//		customerLogin.setPassword(customerCredentials.get(loginName));
//        return customerLogin;
//	}
//}

package com.hamarabank.repository;

import java.util.HashMap;
import java.util.Map;
import com.hamarabank.dto.CustomerLoginDTO;
import com.hamarabank.exception.HamaraBankException;

public class CustomerLoginRepositoryImpl implements CustomerLoginRepository  {
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName) {
        Map<String, String> customerCredentials = new HashMap<String, String>();
        customerCredentials.put("Rima", "rima97");
		customerCredentials.put("Rohan", "rohan98");
		customerCredentials.put("Sohini", "sohi95");
		customerCredentials.put("Phoebe", "pheebs96");
		customerCredentials.put("Ross", "ross87");
        CustomerLoginDTO customerLogin = new CustomerLoginDTO();
        customerLogin.setLoginName(loginName);
        customerLogin.setPassword(customerCredentials.get(loginName));
        return customerLogin;
    }
}
