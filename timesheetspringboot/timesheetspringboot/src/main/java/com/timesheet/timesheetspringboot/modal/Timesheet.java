package com.timesheet.timesheetspringboot.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "timesheet")
public class Timesheet {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "date")
  private String date;

  @Column(name = "working_hours")
  private String workingHours;

  @Column(name = "overtime")
  private String overtime;

  @Column(name = "leave_type")
  private String leavetype;

  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "employee_id", nullable = false)
  @JsonBackReference
  private Employee employee;

  public Timesheet(String date, String workingHours, String overtime, String leavetype) {
    super();
    this.date = date;
    this.workingHours = workingHours;
    this.overtime = overtime;
    this.leavetype = leavetype;
  }

  public Timesheet() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getWorkingHours() {
    return workingHours;
  }

  public void setWorkingHours(String workingHours) {
    this.workingHours = workingHours;
  }

  public String getOvertime() {
    return overtime;
  }

  public void setOvertime(String overtime) {
    this.overtime = overtime;
  }

  public String getLeavetype() {
    return leavetype;
  }

  public void setLeavetype(String leavetype) {
    this.leavetype = leavetype;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  @Override
  public String toString() {
    return "Timesheet [id=" + id + ", date=" + date + ", workingHours=" + workingHours
        + ", overtime=" + overtime + ", leavetype=" + leavetype + ", employee=" + employee + "]";
  }



}
