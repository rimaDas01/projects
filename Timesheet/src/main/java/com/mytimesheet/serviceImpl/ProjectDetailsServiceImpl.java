package com.mytimesheet.serviceImpl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytimesheet.model.ProjectDetails;
import com.mytimesheet.repository.ProjectDetailsRepository;
import com.mytimesheet.service.ProjectDetailsService;

@Service
public class ProjectDetailsServiceImpl implements ProjectDetailsService{

	@Autowired
	private ProjectDetailsRepository projectDetailsRepository ;
	
	@Override
	public List<ProjectDetails> getAllProjectDetails() throws ParseException {
		// TODO Auto-generated method stub
		
		List<ProjectDetails> projectDetailsList = projectDetailsRepository.findAll();
		System.out.println("All projects are: ");
		return projectDetailsList;
	}

	@Override
	public Integer addProjectDetails(ProjectDetails projectDetails) throws ParseException {
		// TODO Auto-generated method stub
		
		projectDetailsRepository.save(projectDetails);
		System.out.println("New Project Details added!");
		return 0;
	}

	@Override
	public ProjectDetails getProjectDetailsByProjectId(Integer projectId) throws ParseException {
		// TODO Auto-generated method stub
		
		Optional<ProjectDetails> optionalProject = projectDetailsRepository.findById(projectId);
		System.out.println("Project details found.");
		if(optionalProject.isEmpty())
			System.out.println("Project not found");
		
		return optionalProject.get();
	}

	@Override
	public void deleteProjectDetails(Integer projectId) throws ParseException {
		// TODO Auto-generated method stub
		
		ProjectDetails project2 = null;
		Optional<ProjectDetails> optionalProject = projectDetailsRepository.findById(projectId);
		if(optionalProject.isPresent()) {
			project2 = optionalProject.get();
			projectDetailsRepository.delete(project2);
			System.out.println("Project deleted");
		}
		else {
			System.out.println("Project details not found");
		}
		
		return ;
	}

	@Override
	public void editProjectDetails(Integer projectId, ProjectDetails projectDetails) throws ParseException {
		// TODO Auto-generated method stub
		
		Optional<ProjectDetails> project = projectDetailsRepository.findById(projectId);
		project.get().setProjectName(projectDetails.getProjectName());
		project.get().setStartDate(projectDetails.getStartDate());
		project.get().setEndDate(projectDetails.getEndDate());
		project.get().setProjectStatus(projectDetails.getProjectStatus());
		
		projectDetailsRepository.save(project.get());
		System.out.println("Project details updated!");
	}

	@Override
	public String getTotalProjects() throws ParseException {
		// TODO Auto-generated method stub
		ArrayList<ProjectDetails> totalProject = new ArrayList<>();
		totalProject.addAll(getAllProjectDetails());
		int projectCount = totalProject.size();
		return "Total projects are: "+projectCount;
	}

	//for query
	@Override
	@Transactional
	public String updateProjectStatus(Integer projectId, String status) throws ParseException {
		// TODO Auto-generated method stub
		projectDetailsRepository.updateProjectStatus(projectId, status);
		return "Project status updated";
	}
}











