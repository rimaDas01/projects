package com.mycompany.springdatarest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.springdatarest.entity.Employee;
import com.mycompany.springdatarest.exception.EmployeeException;
import com.mycompany.springdatarest.service.Employeeservice;

@RestController
@RequestMapping("/apiemployee")
public class EmployeeController {

	@Autowired
	private Employeeservice employeeservice;
	@GetMapping("/getall")
	public List<Employee> getAllEmployees() throws EmployeeException{
		return employeeservice.getAllEmployee();
	}
	
	@GetMapping("/get")
    public ResponseEntity<Employee>getEmployee(@RequestParam Integer employeeId)throws EmployeeException{
        Employee employee= employeeservice.getEmployeeById(employeeId);
        return new ResponseEntity<Employee>(employee,HttpStatus.OK);
}
	@PostMapping("/post")
	public ResponseEntity<Integer>addEmployee(@RequestBody Employee employee) throws EmployeeException{
		Integer employeeId=employeeservice.addEmployee(employee);
		return new ResponseEntity<Integer>(employeeId,HttpStatus.OK);
	}

	@DeleteMapping("/delete")
    public void deleteEmployee(@RequestParam Integer eid) throws EmployeeException {
        employeeservice.deleteEmployee(eid);
        return;
    }    



   @PatchMapping("/patch")
    public void editEmployee(@RequestParam Integer eid,@RequestParam String designation) throws EmployeeException {
        employeeservice.editEmployee(eid, designation);
        return;
    }
}


