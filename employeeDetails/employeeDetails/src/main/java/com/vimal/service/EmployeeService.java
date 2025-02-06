package com.vimal.service;

import com.vimal.form.CreateEmployeeForm;
import com.vimal.form.UpdateEmployeeForm;
import com.vimal.model.Employee;

import java.text.ParseException;
import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployee();

    String saveEmployee(CreateEmployeeForm createemployeeform) throws ParseException;
    String updateEmployee(UpdateEmployeeForm updateemployeeform) throws ParseException;
    String deleteEmployee(Long id);
}
