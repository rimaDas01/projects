package com.timesheet.timesheetspringboot.controller;

import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.timesheet.timesheetspringboot.form.CreateEmployeeForm;
import com.timesheet.timesheetspringboot.form.UpdateEmployeeForm;
import com.timesheet.timesheetspringboot.modal.Employee;
import com.timesheet.timesheetspringboot.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
  @Autowired
  EmployeeService employeeService;

  // get all employee api
  @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<Employee>> employee() {
    return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployee());
  }


  @PostMapping("/")
  public ResponseEntity<Employee> saveEmployee(@RequestBody CreateEmployeeForm createemployeeform)
      throws ParseException {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(employeeService.saveEmployee(createemployeeform));
  }

  @PutMapping("/")
  public String updateEmployee(@RequestBody UpdateEmployeeForm updateemployeeform)
      throws ParseException {
    return employeeService.updateEmployee(updateemployeeform);
  }

  @DeleteMapping(value = "/{id}")
  public String deleteemployee(@PathVariable Long id) {
    return employeeService.deleteEmployee(id);
  }

}
