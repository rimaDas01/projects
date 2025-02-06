package com.timesheet.service;

import java.text.ParseException;
import java.util.List;

import com.timesheet.models.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee() throws ParseException;

}
