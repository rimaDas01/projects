package com.timesheet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.timesheet.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
