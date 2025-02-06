package com.mycompany.springdatarest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.springdatarest.entity.Employee;

@Repository
public interface Employeerepository extends CrudRepository<Employee,Integer> {

}
