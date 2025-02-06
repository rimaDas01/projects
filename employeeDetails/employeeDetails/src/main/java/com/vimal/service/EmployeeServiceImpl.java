package com.vimal.service;

import com.vimal.form.CreateEmployeeForm;
import com.vimal.form.UpdateEmployeeForm;
import com.vimal.model.Employee;
import com.vimal.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployee() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;

    }

    @Override
    public String saveEmployee(CreateEmployeeForm createemployeeform) throws ParseException {
        Employee employee = new Employee();
        employee.setName(createemployeeform.getName());
        employee.setid(createemployeeform.getid());
        employee.setCompany(createemployeeform.getCompany());
        employee.setEmail(createemployeeform.getEmail());
        employee.setAddress(createemployeeform.getAddress());
        employee.setContactNumber(createemployeeform.getContactNumber());
        employee.setCountry(createemployeeform.getCountry());
        employee.setJoiningDate(createemployeeform.getJoiningDate());
        employee.setSkill(createemployeeform.getSkill());
        employee.setStatus(createemployeeform.getStatus());
        employee.setJobTitle(createemployeeform.getJobTitle());
        employeeRepository.save(employee);
        return "Employee details saved";

    }

    @Override
    public String updateEmployee(UpdateEmployeeForm updateemployeeform) throws ParseException {
        Optional<Employee> emp = employeeRepository.findById(updateemployeeform.getid());
        emp.get().setAddress(updateemployeeform.getAddress());
        emp.get().setCompany(updateemployeeform.getCompany());
        emp.get().setContactNumber(updateemployeeform.getContactNumber());
        emp.get().setEmail(updateemployeeform.getEmail());
        emp.get().setName(updateemployeeform.getName());
        emp.get().setSkill(updateemployeeform.getSkill());
        emp.get().setid(updateemployeeform.getid());
        emp.get().setCountry(updateemployeeform.getCountry());
        emp.get().setZip(updateemployeeform.getZip());
        employeeRepository.save(emp.get());

        return "employee deatils updated";
    }




    @Override
    public String deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
        return "employee delete sussesfully";
    }
    }

