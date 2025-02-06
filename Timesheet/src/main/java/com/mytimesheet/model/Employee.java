package com.mytimesheet.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="employee")
public class Employee {
	@Id
    @Column(name="eid")
    private Integer employeeId;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="designation")
    private String designation;
    @Column(name="grade")
    private Character grade;
    @Column(name="password")
    private String password;
    @Column(name="emailId")
    private String emailId;
    @Column(name="startDate")
    private Date startDate;
    @Column(name="endDate")
    private Date enddate;
    @Column(name="empStatus")
    private String empStatus;
    @Column(name="employeeType")
    private String employeeType;
    
    //many to many mapping employee(pk-eid) and project_details(pk-projectId)
//    @ManyToMany
//    @JoinTable(name="employee_project",
//    					joinColumns = @JoinColumn(name = "eid"),
//    					inverseJoinColumns = @JoinColumn(name = "projectId"))
//    
//    
//    private Set<ProjectDetails> assignedProjects = new HashSet<>();
    
    @OneToOne
    @JoinColumn(name = "projectId")
    @JsonManagedReference
    private ProjectDetails projectDetails ;
    
    @OneToOne
    @JoinColumn(name = "timesheetId")
    @JsonManagedReference
    private Timesheet timesheet;
       
    public Employee() {}
    
    public Employee(int employeeId, String firstName, String lastName, String designation, char grade,
            String password, String emailId, Date startDate, Date enddate, String empStatus, String employeeType, ProjectDetails projectDetails) {
        super();
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.grade = grade;
        this.password = password;
        this.emailId = emailId;
        this.startDate = startDate;
        this.enddate = enddate;
        this.empStatus = empStatus;
        this.employeeType = employeeType;
        this.projectDetails = projectDetails;
        this.timesheet = timesheet;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEnddate() {
        return enddate;
    }
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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
    public ProjectDetails getProjectDetails() {
    	return projectDetails;
    }
    public void setProjectDetails(ProjectDetails projectDetails) {
    	this.projectDetails =projectDetails;
    }
    
	public Timesheet getTimesheet() {
		return timesheet;
	}

	public void setTimesheet(Timesheet timesheet) {
		this.timesheet = timesheet;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", designation=" + designation + ", grade=" + grade + ", password=" + password + ", emailId="
				+ emailId + ", startDate=" + startDate + ", enddate=" + enddate + ", empStatus=" + empStatus
				+ ", employeeType=" + employeeType + ", projectDetails=" + projectDetails + ", timesheet=" + timesheet
				+ "]";
	}  

}
