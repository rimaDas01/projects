package com.mycompany.SpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.SpringData.entity.Employee;
import com.mycompany.SpringData.exception.EmployeeException;
import com.mycompany.SpringData.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

	@Autowired
    private EmployeeRepository employeeRepository;
    
	@Override
    public List<Employee> getAllEmployee() throws Exception {
        // TODO Auto-generated method stub
        List<Employee>list=(List<Employee>) employeeRepository.findAll();
        if(list.isEmpty())
            throw new EmployeeException("Employee not found");
        
        return list;
    }
    
	@Override
    public Employee getEmployeeById(Integer id) throws Exception{
        Optional<Employee> optional=employeeRepository.findById(id);
        if(optional.isEmpty())
            throw new EmployeeException("Employee not found");
        return optional.get();
    }
    
	@Override
    public Integer addEmployee(Employee employee) throws Exception {
        employeeRepository.save(employee);
        System.out.println("Object saved");
        return 0;
    }
	
	@Override
    public void editEmployee(Integer employeeId, String designation) throws Exception {
        // TODO Auto-generated method stub
        
    }


  @Override
    public void deleteEmployee(Integer employeeId) throws Exception {
        // TODO Auto-generated method stub
   }
  
}
