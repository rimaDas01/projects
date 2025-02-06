package com.mytimesheet.service;

import java.text.ParseException;
import java.util.List;

import com.mytimesheet.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee() throws ParseException;
	Employee getEmployeeById(Integer employeeId) throws ParseException;
	Integer addEmployee(Employee employee) throws ParseException;
	void deleteEmployee(Integer employeeId)throws ParseException;	
	void editEmployee(Integer employeeId,Employee employee) throws ParseException;
	String getEmployeeCount () throws ParseException;
	
	Integer findAllEmployeeCount();
	
	List <Employee> findById(int id) throws ParseException ;
	
	List<Employee> findByDesignation (String designation) throws ParseException;
	
	List <Object[]> getByInnerJoin() throws ParseException;
	
	List<Object[]> getByLeftJoin(String status) ;
	
	Object[] joinEmpProjectTimesheet(Integer id);
}
