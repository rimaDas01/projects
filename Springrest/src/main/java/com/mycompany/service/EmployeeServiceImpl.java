package com.mycompany.service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.form.CreateEmployeeForm;
import com.mycompany.form.UpdateEmployeeForm;
import com.mycompany.model.Employee;
import com.mycompany.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		List <Employee> employeeList = employeeRepository.findAll();
		return  employeeList;
	}

	@Override
	public String saveEmployee(CreateEmployeeForm createemployeeform) throws ParseException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setName(createemployeeform.getName());
		employee.setempid(createemployeeform.getempid());
		employee.setCompany(createemployeeform.getCompany());
		employee.setEmail(createemployeeform.getEmail());
		employee.setAddress(createemployeeform.getAddress());
		employee.setContactNumber(createemployeeform.getContactNumber());
		employee.setCountry(createemployeeform.getCountry());
		employee.setJoiningDate(createemployeeform.getJoiningDate());
		employee.setSkill(createemployeeform.getSkill());
		employee.setStatus(createemployeeform.getStatus());
		employee.setJobTitle(createemployeeform.getJobTitle());
		
		return "Employee details saved";
	}

	@Override
	public String updateEmployee(UpdateEmployeeForm updateemployeeform) throws ParseException {
		
		// TODO Auto-generated method stub
		Optional<Employee> emp = employeeRepository.findById(updateemployeeform.getempid());
		emp.get().setAddress(updateemployeeform.getAddress());
		emp.get().setCompany(updateemployeeform.getCompany());
		emp.get().setContactNumber(updateemployeeform.getContactNumber());
		emp.get().setEmail(updateemployeeform.getEmail());
		emp.get().setName(updateemployeeform.getName());
		emp.get().setSkill(updateemployeeform.getSkill());
		emp.get().setempid(updateemployeeform.getempid());
		emp.get().setCountry(updateemployeeform.getCountry());
		emp.get().setZip(updateemployeeform.getZip());
		
		return "employee deatils updated";
	}

	@Override
	public String deleteEmployee(Long empid) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(empid);
		return "employee deleted ";
	}

}
