package com.mycompany.springdatarest.service;

import java.util.List;

import com.mycompany.springdatarest.entity.Employee;
import com.mycompany.springdatarest.exception.EmployeeException;


public interface Employeeservice {

	List<Employee> getAllEmployee() throws EmployeeException;
	Employee getEmployeeById(Integer id) throws EmployeeException;
	Integer addEmployee(Employee employee) throws EmployeeException;
	void editEmployee(Integer employeeId,String designation) throws EmployeeException;
	void deleteEmployee(Integer employeeId) throws EmployeeException;
}
