package com.mycompany.springdatarest.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.springdatarest.entity.Employee;
import com.mycompany.springdatarest.exception.EmployeeException;
import com.mycompany.springdatarest.repository.Employeerepository;







@Service
public class EmployeeServiceImpl  implements Employeeservice{



   @Autowired
    private Employeerepository employeeRepository;
    
    @Override
    public List<Employee> getAllEmployee() throws EmployeeException {
        // TODO Auto-generated method stub
        List<Employee>list=(List<Employee>) employeeRepository.findAll();
        if(list.isEmpty())
            throw new EmployeeException("Employee not found");
        
        return list;
    }
    
    @Override
    public Employee getEmployeeById(Integer id) throws EmployeeException{
    	Optional<Employee> optional=employeeRepository.findById(id);
    	if(optional.isEmpty())
    		throw new EmployeeException("Employee not found");
    	return optional.get();
    }
    
    @Override
    public Integer addEmployee(Employee employee) throws EmployeeException {
        employeeRepository.save(employee);
        System.out.println("object saved");
        return 0;
    }



   @Override
    public void editEmployee(Integer employeeId, String designation) throws EmployeeException {
        // TODO Auto-generated method stub
	   Optional<Employee>optional=employeeRepository.findById(employeeId);
       if(optional.isEmpty())
           throw new EmployeeException();
       Employee emp=optional.get();
       emp.setDesignation(designation);
       employeeRepository.save(emp);
       System.out.println("Employee edited");
   }
    



   @Override
    public void deleteEmployee(Integer employeeId) throws EmployeeException {
        // TODO Auto-generated method stub
	   Employee emp2=null;
       Optional<Employee>optional1=employeeRepository.findById(employeeId);
       if(optional1.isPresent()) {
           emp2=optional1.get();
           employeeRepository.delete(emp2);
           System.out.println("Employee deleted");
       }
       else {
           System.out.println("Employee not found");
       }


    }




}