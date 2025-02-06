package com.mytimesheet.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mytimesheet.model.Employee;
import com.mytimesheet.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	 EmployeeService employeeService;
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployee() throws ParseException{
        return employeeService.getAllEmployee();
    }
	
//	@GetMapping("/get")
//	public ResponseEntity< Employee> getEmployeeById(@RequestParam Integer employeeId) throws ParseException{
//		Employee emp =  employeeService.getEmployeeById(employeeId);
//		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
//	}
	
	@PostMapping("/add")
	public ResponseEntity<Integer>addEmployee(@RequestBody Employee employee) throws ParseException{
		Integer employeeId = employeeService.addEmployee(employee);
		return new ResponseEntity<Integer>(employeeId, HttpStatus.OK);
	
	}
	
	@DeleteMapping("/delete")
	public void deleteEmployee(@RequestParam (value="employeeId") Integer employeeId) throws ParseException{
		System.out.println("Employee successfully deleted")	;
		employeeService.deleteEmployee(employeeId);
	}
	
	@PutMapping("/edit")
	public void editEmployee(@RequestParam Integer employeeId, @RequestBody Employee employee) throws ParseException{
		employeeService.editEmployee(employeeId, employee);
	}
	
	//mapping through query
	
	@GetMapping("/getempcount")
	public String getempcount() throws ParseException{
		return employeeService.getEmployeeCount();
	}
	
	@GetMapping(path = {"/get/v2"})
	public Integer FindAllEmployeeByQuery() {
		return employeeService.findAllEmployeeCount();
	}
	
	@GetMapping( path = {"/get{ id }"} )
	public List<Employee> findById(int id) throws ParseException {
		return employeeService.findById(id);
	}
	
	@GetMapping( path = {"/gett{ designation }"} )
	public List<Employee> findByDesignation(String designation) throws ParseException {
		return employeeService.findByDesignation(designation);
	}
	
	@GetMapping( path = {"/joinempproject"} )
	public List<Object[]> getByInnerJoin() throws ParseException{
		return employeeService.getByInnerJoin();		
	}
	
	@GetMapping(path = { "/leftjoin{status}" } )
	public List<Object[]> getByLeftJoin(String status) {
		return employeeService.getByLeftJoin(status);
	}
	
	@GetMapping( "/threetablejoin{id}" )
	public Object[] joinEmpProjectTimesheet(Integer id) {
		return employeeService.joinEmpProjectTimesheet(id);
		
	}
}
