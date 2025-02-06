package com.mytimesheet.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mytimesheet.model.ProjectDetails;

@Repository
public interface ProjectDetailsRepository extends JpaRepository<ProjectDetails, Integer> {
	
	@Modifying
	@Query("update ProjectDetails as p set p.projectStatus =:status where p.projectId =:id")
	void updateProjectStatus(Integer id, String status);
}
