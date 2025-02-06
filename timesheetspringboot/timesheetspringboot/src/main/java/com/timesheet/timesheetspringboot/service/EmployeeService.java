package com.timesheet.timesheetspringboot.service;

import java.text.ParseException;
import java.util.List;
import com.timesheet.timesheetspringboot.form.CreateEmployeeForm;
import com.timesheet.timesheetspringboot.form.UpdateEmployeeForm;
import com.timesheet.timesheetspringboot.modal.Employee;

public interface EmployeeService {
  List<Employee> getEmployee();

  Employee saveEmployee(CreateEmployeeForm createemployeeform) throws ParseException;

  String updateEmployee(UpdateEmployeeForm updateemployeeform) throws ParseException;

  String deleteEmployee(Long id);

}
