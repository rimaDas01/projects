package com.mytimesheet.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="project_details")
public class ProjectDetails {
	
	@Id
	@Column(name="projectId")
	private Integer projectId;
	@Column(name="projectName")
	private String projectName;
	@Column(name="startDate")
	private Date startDate;
	@Column(name="endDate")
	private Date endDate;
	@Column(name="projectStatus")
	private String projectStatus;
	
//	@ManyToMany(mappedBy = "assignedProjects")
//	private Set<Employee> employeeSet  = new HashSet<>();
	
//	@OneToOne(mappedBy = "projectDetails")
//	@JsonBackReference
//	private Employee employee;
	
	public ProjectDetails() {}

	public ProjectDetails(Integer projectId, String projectName, Date startDate, Date endDate, String projectStatus) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectStatus = projectStatus;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
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

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

//	public ProjectDetails(Employee employee) {
//		super();
//		this.employee = employee;
//	}
	

//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}

	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", projectName=" + projectName + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", projectStatus=" + projectStatus + ", employee=" + "]";
	}

	
	
}
