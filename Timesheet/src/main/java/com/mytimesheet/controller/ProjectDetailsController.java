package com.mytimesheet.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mytimesheet.model.ProjectDetails;
import com.mytimesheet.service.ProjectDetailsService;

@RestController
@RequestMapping("/projectdetails")
public class ProjectDetailsController {
	
	@Autowired
	ProjectDetailsService projectDetailsService;
	
	@GetMapping("/getall")
	public List<ProjectDetails> getAllProjectDetails() throws ParseException{
		return projectDetailsService.getAllProjectDetails();
	}
	
//	@PostMapping("/add")
//	public ResponseEntity<Integer> addProjectDetails(@RequestBody ProjectDetails projectDetails) throws ParseException{
//		Integer projectId = projectDetailsService.addProjectDetails(projectDetails);
//		return new ResponseEntity<Integer>(projectId, HttpStatus.OK);
//	}
	
	@PostMapping("/add")
	public String addProjectDetails(@RequestBody ProjectDetails projectDetails) throws ParseException{
		Integer projectId = projectDetailsService.addProjectDetails(projectDetails);
		return "Project added successfully";
	}
	
	@GetMapping("/get")
	public ResponseEntity<ProjectDetails> getProjectDetailsById(@RequestParam Integer projectId) throws ParseException{
		ProjectDetails project1 = projectDetailsService.getProjectDetailsByProjectId(projectId);
		return new ResponseEntity<ProjectDetails>(project1,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public String deleteProjectDetails(@RequestParam Integer projectId) throws ParseException{
		projectDetailsService.deleteProjectDetails(projectId);
		return "Project deleted successfully";
		
	}
	
	@PutMapping("/update")
	public String updateProjectDetails(@RequestParam Integer projectId, @RequestBody ProjectDetails projectDetails) throws ParseException{
		projectDetailsService.editProjectDetails(projectId, projectDetails);
		return "Project details updated";
	}
	
	@GetMapping("/getprojectcount")
	public String getProjectCount() throws ParseException{
		return projectDetailsService.getTotalProjects();
	}
	
	//for query
	@PatchMapping("/updateprojectstatus{id}{status}")
	public String updateProjectStatus(@RequestParam Integer id, @RequestParam String status) throws ParseException {
		 projectDetailsService.updateProjectStatus(id, status);
		 return "Project status updated";
	}
}
