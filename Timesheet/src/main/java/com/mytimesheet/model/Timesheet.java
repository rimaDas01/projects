package com.mytimesheet.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table( name = "timesheet_details" )
public class Timesheet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="timesheetId")
	private Integer timesheetId;
	@Column(name="timesheetDate")
	private Date timesheetDate;
	@Column(name ="overtime")
	private Double overtime;
	@Column(name = "leaveType")
	private String leaveType;
	
	@OneToOne(mappedBy = "timesheet")
	@JsonBackReference
	private Employee employee;
	
	public Timesheet() {}

	public Timesheet(int timesheetId, Date timesheetDate, double overtime, String leaveType) {
		super();
		this.timesheetId = timesheetId;
		this.timesheetDate = timesheetDate;
		this.overtime = overtime;
		this.leaveType = leaveType;
		this.employee = employee;
	}

	public int getTimesheetId() {
		return timesheetId;
	}

	public void setTimesheetId(int timesheetId) {
		this.timesheetId = timesheetId;
	}

	public Date getTimesheetDate() {
		return timesheetDate;
	}

	public void setTimesheetDate(Date timesheetDate) {
		this.timesheetDate = timesheetDate;
	}

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Timesheet [timesheetId=" + timesheetId + ", timesheetDate=" + timesheetDate + ", overtime=" + overtime
				+ ", leaveType=" + leaveType + ", employee=" + employee + "]";
	}

}
