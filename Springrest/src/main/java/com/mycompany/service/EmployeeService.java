package com.mycompany.service;

import java.text.ParseException;
import java.util.List;

import com.mycompany.form.CreateEmployeeForm;
import com.mycompany.form.UpdateEmployeeForm;
import com.mycompany.model.Employee;

public interface EmployeeService {
	List<Employee> getEmployee();
	
	String saveEmployee(CreateEmployeeForm createemployeeform) throws ParseException;
	String updateEmployee(UpdateEmployeeForm updateemployeeform) throws ParseException;
	String deleteEmployee(Long empid);

	

}
