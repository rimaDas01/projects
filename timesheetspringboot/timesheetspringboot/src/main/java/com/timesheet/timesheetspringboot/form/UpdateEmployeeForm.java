package com.timesheet.timesheetspringboot.form;

public class UpdateEmployeeForm {
  private Long employee_id;
  private String firstname;
  private String lastname;
  private String designation;
  private String grade;
  private String password;
  private String emailid;
  private String startDate;
  private String endDate;
  private String employeestatus;
  private String employeetype;

  public Long getEmployee_id() {
    return employee_id;
  }

  public void setEmployee_id(Long employee_id) {
    this.employee_id = employee_id;
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

  public String getEmailid() {
    return emailid;
  }

  public void setEmailid(String emailid) {
    this.emailid = emailid;
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

  public String getEmployeestatus() {
    return employeestatus;
  }

  public void setEmployeestatus(String employeestatus) {
    this.employeestatus = employeestatus;
  }

  public String getEmployeetype() {
    return employeetype;
  }

  public void setEmployeetype(String employeetype) {
    this.employeetype = employeetype;
  }


}
