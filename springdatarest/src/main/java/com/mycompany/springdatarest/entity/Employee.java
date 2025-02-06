package com.mycompany.springdatarest.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer id;
	@Column(name="ename")
	private String name;
	@Column(name="esalary")
	private Double salary;
	@Column(name="edesignation")
	private String designation;
	@Column(name="doj")
	private LocalDate doj;
	
	public Employee() {};
	

	public Employee(Integer id, String name, Double salary, String designation, LocalDate doj) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.doj = doj;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDoj() {
		return doj;
	}


	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", doj=" + doj + "]";
	}


	
	
	

}