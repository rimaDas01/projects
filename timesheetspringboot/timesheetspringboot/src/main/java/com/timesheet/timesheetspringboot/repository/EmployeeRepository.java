package com.timesheet.timesheetspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.timesheet.timesheetspringboot.modal.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
