package com.timesheet.timesheetspringboot.service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.timesheetspringboot.form.CreateProjectDetailsForm;
import com.timesheet.timesheetspringboot.form.UpdateProjectDetailsForm;
import com.timesheet.timesheetspringboot.modal.ProjectDetails;
import com.timesheet.timesheetspringboot.repository.ProjectDetailRepository;

@Service
public class ProjectDetailsServiceImpl implements ProjectDetailsService {
	
	 @Autowired
	 ProjectDetailRepository projectDetailRepository;

	@Override
	public List<ProjectDetails> getAllProjectDetail() {
		List<ProjectDetails> projectList = projectDetailRepository.findAll();
        return projectList;
	}

	@Override
	public String saveprojectDetails(CreateProjectDetailsForm createprojectDetailsform) throws ParseException {
		 ProjectDetails pro_deta = new ProjectDetails();
		 pro_deta.setProject_id(createprojectDetailsform.getProject_id());
		 pro_deta.setProjectname(createprojectDetailsform.getProjectname());
		 pro_deta.setStartdate(createprojectDetailsform.getStartdate());
		 pro_deta.setEnddate(createprojectDetailsform.getEnddate());
		 pro_deta.setProjectstatus(createprojectDetailsform.getProjectstatus());
		 projectDetailRepository.save(pro_deta);

		return "project details saved";
	}

	@Override
	public String updateprojectDetails(UpdateProjectDetailsForm updateprojectDetailsform) throws ParseException {
		Optional<ProjectDetails> pro = projectDetailRepository.findById(updateprojectDetailsform.getProject_id());
		pro.get().setProject_id(updateprojectDetailsform.getProject_id());
		pro.get().setProjectname(updateprojectDetailsform.getProjectname());
		pro.get().setStartdate(updateprojectDetailsform.getStartdate());
		pro.get().setEnddate(updateprojectDetailsform.getEnddate());
		pro.get().setProjectstatus(updateprojectDetailsform.getProjectstatus());
		
		projectDetailRepository.save(pro.get());
		return "project deatils updated";
	}

	@Override
	public String deleteprojectDetails(int id) {
		projectDetailRepository.deleteById(id);
        return "project delete sussesfully";
	}

}
