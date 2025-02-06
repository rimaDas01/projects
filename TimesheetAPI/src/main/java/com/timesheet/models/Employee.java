package com.timesheet.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
		@Column(name="employeeId")
		private Integer id;
		@Column(name="firstName")
		private String firstName;
		@Column(name="lastName")
		private String lastName;
		@Column(name="designation")
		private String designation;
		@Column(name="grade")
		private Character grade;
		@Column (name="emailId")
		private String emailId;
		@Column(name="password")
		private String password;
		@Column(name="startDate")
		private Date startDate;
		@Column (name="endDate")
		private Date endDate;
		@Column(name="empStatus")
		private String empStatus;
		@Column(name="employeeType")
		private String employeeType;
	
		public Employee() {};

		public Employee(Integer id, String firstName, String lastName, String designation, Character grade, String emailId,
			String password, Date startDate, Date endDate, String empStatus, String employeeType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.grade = grade;
		this.emailId = emailId;
		this.password = password;
		this.startDate = startDate;
		this.endDate = endDate;
		this.empStatus = empStatus;
		this.employeeType = employeeType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Character getGrade() {
		return grade;
	}

	public void setGrade(Character grade) {
		this.grade = grade;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", designation="
				+ designation + ", grade=" + grade + ", emailId=" + emailId + ", password=" + password + ", startDate="
				+ startDate + ", endDate=" + endDate + ", empStatus=" + empStatus + ", employeeType=" + employeeType
				+ "]";
	}	

}
