package com.timesheet.timesheetspringboot.service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.timesheet.timesheetspringboot.form.CreateEmployeeForm;
import com.timesheet.timesheetspringboot.form.UpdateEmployeeForm;
import com.timesheet.timesheetspringboot.modal.Employee;
import com.timesheet.timesheetspringboot.modal.Timesheet;
import com.timesheet.timesheetspringboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;

  @Override
  public List<Employee> getEmployee() {
    try {
      List<Employee> employeeList = employeeRepository.findAll();
      return employeeList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }



  @Override
  public Employee saveEmployee(CreateEmployeeForm form) throws ParseException {
    Employee employee = new Employee(form.getFirstname(), form.getLastname(), form.getDesignation(),
        form.getGrade(), form.getPassword(), form.getEmailid(), form.getStartDate(),
        form.getEndDate(), form.getEmployeestatus(), form.getEmployeetype());

    Timesheet timesheet = new Timesheet(form.getStartDate(), form.getWorkingHours(),
        form.getOvertime(), form.getLeavetype());

    employee.setTimesheet(timesheet);
    timesheet.setEmployee(employee);

    employee = employeeRepository.save(employee);
    return employee;
  }


  @Override
  public String updateEmployee(UpdateEmployeeForm updateemployeeform) throws ParseException {
    Optional<Employee> emp = employeeRepository.findById(updateemployeeform.getEmployee_id());
    emp.get().setFirstname(updateemployeeform.getFirstname());
    emp.get().setLastname(updateemployeeform.getLastname());
    emp.get().setDesignation(updateemployeeform.getDesignation());
    emp.get().setGrade(updateemployeeform.getGrade());
    emp.get().setPassword(updateemployeeform.getPassword());
    emp.get().setEmailId(updateemployeeform.getEmailid());
    emp.get().setStartDate(updateemployeeform.getEndDate());
    emp.get().setEndDate(updateemployeeform.getEmployeestatus());
    emp.get().setType(updateemployeeform.getEmployeetype());
    employeeRepository.save(emp.get());
    return "employee deatils updated";
  }

  @Override
  public String deleteEmployee(Long id) {
    employeeRepository.deleteById(id);
    return "employee delete sussesfully";

  }

}
