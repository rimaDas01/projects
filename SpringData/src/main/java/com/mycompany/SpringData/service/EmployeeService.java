package com.mycompany.SpringData.service;

import java.util.List;

import com.mycompany.SpringData.entity.Employee;

public interface EmployeeService {
	Integer addEmployee(Employee employee)throws Exception;
    void editEmployee(Integer employeeId, String designation)throws Exception;
    void deleteEmployee(Integer employeeId)throws Exception;
    List<Employee> getAllEmployee() throws Exception;
    Employee getEmployeeById(Integer id) throws Exception;
}
