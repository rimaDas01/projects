package com.timesheet.timesheetspringboot.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProjectDetails")
public class ProjectDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int project_id;

  @Column(name = "Project_name")
  private String projectname;

  @Column(name = "Start_Date")
  private String startdate;

  @Column(name = "End_Date")
  private String enddate;

  @Column(name = "Project_status")
  private String projectstatus;

  public ProjectDetails() {}

  public ProjectDetails(int project_id, String projectname, String startdate, String enddate,
      String projectstatus) {
    this.project_id = project_id;
    this.projectname = projectname;
    this.startdate = startdate;
    this.enddate = enddate;
    this.projectstatus = projectstatus;
  }

  public int getProject_id() {
    return project_id;
  }

  public void setProject_id(int project_id) {
    this.project_id = project_id;
  }

  public String getProjectname() {
    return projectname;
  }

  public void setProjectname(String projectname) {
    this.projectname = projectname;
  }

  public String getStartdate() {
    return startdate;
  }

  public void setStartdate(String startdate) {
    this.startdate = startdate;
  }

  public String getEnddate() {
    return enddate;
  }

  public void setEnddate(String enddate) {
    this.enddate = enddate;
  }

  public String getProjectstatus() {
    return projectstatus;
  }

  public void setProjectstatus(String projectstatus) {
    this.projectstatus = projectstatus;
  }


}
