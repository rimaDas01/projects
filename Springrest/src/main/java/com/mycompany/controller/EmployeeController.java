package com.mycompany.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.form.CreateEmployeeForm;
import com.mycompany.form.UpdateEmployeeForm;
import com.mycompany.model.Employee;
import com.mycompany.service.EmployeeService;

@RestController
@RequestMapping({"/employee"})
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//get all employee details
	@GetMapping(path={"/get"})
	public List<Employee> employee(){
		return employeeService.getEmployee();		
	}
	
//	public ResponseEntity<List<Employee>> employee() {
//        try {
//            System.out.println("Inside get");
//            return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployee());
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
//        }
//    }
//	
	
	// save all employee detail
	@PostMapping("/add")
	 public String saveEmployee(@RequestBody CreateEmployeeForm createemployeeform ) throws ParseException{
		return employeeService.saveEmployee(createemployeeform);
	}
	// update all employee details
	 @PutMapping("/update")
	 public String updateEmployee(@RequestBody UpdateEmployeeForm updateemployeeform) throws ParseException{
			return employeeService.updateEmployee(updateemployeeform);
	 }
	 // delete employee by id
     @DeleteMapping(value="/id")
     public String deleteEmployee(@PathVariable Long empid)
     {
    	 return employeeService.deleteEmployee(empid);
     }
    
	
}
