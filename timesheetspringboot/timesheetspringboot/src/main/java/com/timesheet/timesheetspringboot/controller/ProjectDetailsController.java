package com.timesheet.timesheetspringboot.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.timesheetspringboot.form.CreateProjectDetailsForm;
import com.timesheet.timesheetspringboot.form.UpdateProjectDetailsForm;
import com.timesheet.timesheetspringboot.modal.ProjectDetails;
import com.timesheet.timesheetspringboot.service.ProjectDetailsService;


@RestController
@RequestMapping("/api/v1/")
public class ProjectDetailsController {
	@Autowired
	ProjectDetailsService projectDetailsService;
	
	//get all project api
	@GetMapping("/allproject")
	public List<ProjectDetails> ProjectDetails() {
        return projectDetailsService.getAllProjectDetail();
	}
	
	@PostMapping("/Addproject")
	public String saveprojectDetails(@RequestBody CreateProjectDetailsForm createprojectDetailsform) throws ParseException {
        return projectDetailsService.saveprojectDetails(createprojectDetailsform);
    }
	@PutMapping("/updateproject")
    public String updateprojectDetails(@RequestBody UpdateProjectDetailsForm UpdateProjectDetailsForm) throws ParseException {
        return projectDetailsService.updateprojectDetails(UpdateProjectDetailsForm );
    }
	@DeleteMapping(value = "/deleteproject/{id}")
    public String deleteprojectDetails(@PathVariable int id) {
        return projectDetailsService.deleteprojectDetails(id);
    }
}
