package com.mytimesheet.service;

import java.text.ParseException;
import java.util.List;

import com.mytimesheet.model.ProjectDetails;

public interface ProjectDetailsService  {
	
	List<ProjectDetails> getAllProjectDetails() throws ParseException;
	Integer addProjectDetails(ProjectDetails projectDetails) throws ParseException;
	ProjectDetails getProjectDetailsByProjectId(Integer projectId) throws ParseException;
	void deleteProjectDetails(Integer projectId)throws ParseException;	
	void editProjectDetails(Integer projectId, ProjectDetails projectDetails)throws ParseException;
	String getTotalProjects() throws ParseException;
	
	//for query
	String updateProjectStatus(Integer projectId, String status ) throws ParseException;
}
