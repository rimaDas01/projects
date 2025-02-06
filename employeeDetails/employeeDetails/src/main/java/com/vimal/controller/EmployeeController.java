package com.vimal.controller;

import com.vimal.form.CreateEmployeeForm;
import com.vimal.form.UpdateEmployeeForm;
import com.vimal.model.Employee;
import com.vimal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(path = {"/get"})
    public List<Employee> employee() {
        return employeeService.getEmployee();

    }

    @PostMapping("/add")
    public String saveEmployee(@RequestBody CreateEmployeeForm createemployeeform) throws ParseException {
        return employeeService.saveEmployee(createemployeeform);

    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody UpdateEmployeeForm updateemployeeform) throws ParseException {
        return employeeService.updateEmployee(updateemployeeform);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteemployee(@PathVariable Long id) {
        return employeeService.deleteEmployee(id);
    }

//    @DeleteMapping("/employee/{id}")
//    public String delete(@PathVariable Long id) {
//
//        employeeService.deleteEmployee(id);
//
//        return "Employee removed with id " + id;
    }

