package com.timesheet.timesheetspringboot.service;

import java.text.ParseException;
import java.util.List;
import com.timesheet.timesheetspringboot.form.CreateTimesheetForm;
import com.timesheet.timesheetspringboot.form.UpdateTimesheetForm;
import com.timesheet.timesheetspringboot.modal.Timesheet;

public interface TimesheetService {
  List<Timesheet> getTimesheet();

  String saveTimesheet(CreateTimesheetForm createTimesheetform) throws ParseException;

  String updateTimesheet(UpdateTimesheetForm updateTimesheetform) throws ParseException;

  String deleteTimesheet(Long id);

}
