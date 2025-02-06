package com.timesheet.timesheetspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.timesheet.timesheetspringboot.modal.Timesheet;

@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {

}
