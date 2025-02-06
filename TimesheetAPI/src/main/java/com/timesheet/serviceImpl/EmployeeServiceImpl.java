package com.timesheet.serviceImpl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.models.Employee;
import com.timesheet.repository.EmployeeRepository;
import com.timesheet.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() throws ParseException {
		
		List<Employee>empList = (List<Employee>) employeeRepository.findAll();
	
		return empList;
	}

	
	
}
