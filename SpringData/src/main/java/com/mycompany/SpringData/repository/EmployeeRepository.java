package com.mycompany.SpringData.repository;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.SpringData.entity.Employee;

public interface EmployeeRepository  extends CrudRepository<Employee , Integer> {
	

}
