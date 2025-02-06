package com.timesheet.timesheetspringboot.form;

public class UpdateTimesheetForm {

  private Long timesheetid;
  private String date;
  private String workingHours;
  private String overtime;
  private String leavetype;

  public Long getTimesheetid() {
    return timesheetid;
  }

  public void setTimesheetid(Long timesheetid) {
    this.timesheetid = timesheetid;
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

}


