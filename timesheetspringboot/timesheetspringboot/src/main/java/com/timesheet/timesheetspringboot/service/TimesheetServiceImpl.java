package com.timesheet.timesheetspringboot.service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.timesheet.timesheetspringboot.form.CreateTimesheetForm;
import com.timesheet.timesheetspringboot.form.UpdateTimesheetForm;
import com.timesheet.timesheetspringboot.modal.Timesheet;
import com.timesheet.timesheetspringboot.repository.TimesheetRepository;

@Service
public class TimesheetServiceImpl implements TimesheetService {

  @Autowired
  TimesheetRepository timesheetRepository;

  @Override
  public List<Timesheet> getTimesheet() {
    List<Timesheet> TimesheetList = timesheetRepository.findAll();
    return TimesheetList;
  }

  @Override
  public String saveTimesheet(CreateTimesheetForm createTimesheetform) throws ParseException {
    Timesheet timesheet = new Timesheet();
    timesheet.setDate(createTimesheetform.getDate());
    timesheet.setWorkingHours(createTimesheetform.getWorkingHours());
    timesheet.setOvertime(createTimesheetform.getOvertime());
    timesheet.setLeavetype(createTimesheetform.getLeavetype());
    timesheetRepository.save(timesheet);
    return "Employee details saved";
  }

  @Override
  public String updateTimesheet(UpdateTimesheetForm updateTimesheetform) throws ParseException {
    Optional<Timesheet> timesheetUP =
        timesheetRepository.findById(updateTimesheetform.getTimesheetid());
    timesheetUP.get().setDate(updateTimesheetform.getDate());
    timesheetUP.get().setWorkingHours(updateTimesheetform.getWorkingHours());
    timesheetUP.get().setOvertime(updateTimesheetform.getOvertime());
    timesheetUP.get().setLeavetype(updateTimesheetform.getLeavetype());
    timesheetRepository.save(timesheetUP.get());
    return "Timesheet updated";
  }

  @Override
  public String deleteTimesheet(Long id) {
    timesheetRepository.deleteById(id);
    return "Timesheet delete sussesfully";

  }

}
