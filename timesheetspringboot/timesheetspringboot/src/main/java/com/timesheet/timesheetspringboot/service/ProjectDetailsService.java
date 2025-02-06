package com.timesheet.timesheetspringboot.service;

import java.text.ParseException;
import java.util.List;

import com.timesheet.timesheetspringboot.form.CreateProjectDetailsForm;
import com.timesheet.timesheetspringboot.form.UpdateProjectDetailsForm;
import com.timesheet.timesheetspringboot.modal.ProjectDetails;


public interface ProjectDetailsService {
    List<ProjectDetails> getAllProjectDetail();
    
    String saveprojectDetails(CreateProjectDetailsForm createprojectDetailsform) throws ParseException;
    String updateprojectDetails(UpdateProjectDetailsForm updateprojectDetailsform) throws ParseException;
    String deleteprojectDetails(int id);
}
