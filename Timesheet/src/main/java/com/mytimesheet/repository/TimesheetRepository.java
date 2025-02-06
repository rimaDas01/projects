package com.mytimesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mytimesheet.model.Timesheet;

@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet, Integer> {

}
