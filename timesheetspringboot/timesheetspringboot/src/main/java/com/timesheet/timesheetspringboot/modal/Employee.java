package com.timesheet.timesheetspringboot.modal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "employee")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "first_name")
  private String firstname;

  @Column(name = "last_name")
  private String lastname;

  @Column(name = "designation")
  private String designation;

  @Column(name = "grade")
  private String grade;

  @Column(name = "password")
  private String password;

  @Column(name = "email_id")
  private String emailId;

  @Column(name = "start_date")
  private String startDate;

  @Column(name = "end_date")
  private String endDate;

  @Column(name = "status")
  private String status;

  @Column(name = "type")
  private String type;

  @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
  @JsonManagedReference
  private Timesheet timesheet;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
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

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Timesheet getTimesheet() {
    return timesheet;
  }

  public void setTimesheet(Timesheet timesheet) {
    this.timesheet = timesheet;
  }

  public Employee(String firstname, String lastname, String designation, String grade,
      String password, String emailId, String startDate, String endDate, String status,
      String type) {
    super();
    this.firstname = firstname;
    this.lastname = lastname;
    this.designation = designation;
    this.grade = grade;
    this.password = password;
    this.emailId = emailId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.status = status;
    this.type = type;
  }

  public Employee() {
    super();
    // TODO Auto-generated constructor stub
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname
        + ", designation=" + designation + ", grade=" + grade + ", password=" + password
        + ", emailId=" + emailId + ", startDate=" + startDate + ", endDate=" + endDate + ", status="
        + status + ", type=" + type + ", timesheet=" + timesheet + "]";
  }

}
