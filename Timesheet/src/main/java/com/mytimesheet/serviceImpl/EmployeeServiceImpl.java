package com.mytimesheet.serviceImpl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytimesheet.model.Employee;
import com.mytimesheet.model.ProjectDetails;
import com.mytimesheet.repository.EmployeeRepository;
import com.mytimesheet.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() throws ParseException {
		// TODO Auto-generated method stub

		try {
			List<Employee> empList = (List<Employee>)employeeRepository.findAll();
			System.out.println("Employees are:");
			return empList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) throws ParseException {
		// TODO Auto-generated method stub
		
		Optional <Employee> optional = employeeRepository.findById(employeeId);
		System.out.println("Employee found!");
		if(optional.isEmpty())
			System.out.println("Employee not found");
		
		return optional.get();
	}

	@Override
	public Integer addEmployee(Employee employee) throws ParseException {
		// TODO Auto-generated method stub
		
		employeeRepository.save(employee);
		System.out.println("Employee added!");
		return 0;
	}

	@Override
	public void deleteEmployee(Integer employeeId) throws ParseException {
		// TODO Auto-generated method stub
		
		Employee emp = null;
		Optional<Employee> optionalEmp = employeeRepository.findById(employeeId);
		if(optionalEmp.isPresent()) {
			emp=optionalEmp.get();
	           employeeRepository.delete(emp);
	           System.out.println("Employee deleted");
	       }
	       else {
	           System.out.println("Employee not found");
	       }
	}

	@Override
	public void editEmployee(Integer employeeId, Employee employee) throws ParseException {
		// TODO Auto-generated method stub
		
		Optional <Employee> emp = employeeRepository.findById(employeeId);
		emp.get().setDesignation(employee.getDesignation());
		emp.get().setEmailId(employee.getEmailId());
		emp.get().setEmployeeType(employee.getEmployeeType());
		emp.get().setEmpStatus(employee.getEmpStatus());
		emp.get().setEnddate(employee.getEnddate());
		emp.get().setFirstName(employee.getFirstName());
		emp.get().setGrade(employee.getGrade());
		emp.get().setLastName(employee.getLastName());
		emp.get().setPassword(employee.getPassword());
		emp.get().setStartDate(employee.getStartDate());
		
		ProjectDetails projectdetails=employee.getProjectDetails();

//      projectdetails.setProjectName(employee.getProjectDetails().getProjectName());
//	projectdetails.setProjectId(employee.getProjectDetails().getProjectId());
//      projectdetails.setStartDate(employee.getProjectDetails().getStartDate());
//      projectdetails.setEndDate(employee.getProjectDetails().getEndDate());
//      projectdetails.setProjectStatus(employee.getProjectDetails().getProjectStatus());
      
      	emp.get().setProjectDetails(projectdetails);
		employeeRepository.save(emp.get());
		System.out.println("Employee details updated!");
	}

	@Override
	public String getEmployeeCount() throws ParseException {
		// TODO Auto-generated method stub
		ArrayList<Employee> totalEmployees = new ArrayList<>();
		totalEmployees.addAll(getAllEmployee());
		int count=totalEmployees.size();
		return "total: "+count;
	}

	@Override
	public Integer findAllEmployeeCount() {
		// TODO Auto-generated method stub
		return employeeRepository.findAllEmployeeCount();
	}

	@Override
	public List<Employee> findByDesignation(String designation) throws ParseException {
		// TODO Auto-generated method stub
		return employeeRepository.findByDesignation(designation);
	}

	@Override
	public List<Employee> findById(int id) throws ParseException {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public List<Object[]> getByInnerJoin() throws ParseException {
		// TODO Auto-generated method stub
		return employeeRepository.getDetailsByInnerJoin();
	}

	@Override
	public List<Object[]> getByLeftJoin(String status) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmpProjectByLeftJoin(status);
	}

	@Override
	public Object[] joinEmpProjectTimesheet(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.joinEmpProjectTimesheet(id);
	}
}
