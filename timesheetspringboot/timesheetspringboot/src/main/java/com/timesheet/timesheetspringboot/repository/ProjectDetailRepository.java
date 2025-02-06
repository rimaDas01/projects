package com.timesheet.timesheetspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timesheet.timesheetspringboot.modal.ProjectDetails;

@Repository
public interface ProjectDetailRepository extends JpaRepository<ProjectDetails,Integer > {

}
