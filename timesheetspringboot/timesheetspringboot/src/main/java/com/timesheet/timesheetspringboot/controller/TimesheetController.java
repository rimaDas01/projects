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
import com.timesheet.timesheetspringboot.form.CreateTimesheetForm;
import com.timesheet.timesheetspringboot.form.UpdateTimesheetForm;
import com.timesheet.timesheetspringboot.modal.Timesheet;
import com.timesheet.timesheetspringboot.service.TimesheetService;

@RestController
@RequestMapping("/api/v1/timesheet")
public class TimesheetController {
  @Autowired
  TimesheetService timesheetService;

  // get all employee api
  @GetMapping("/")
  public List<Timesheet> employee() {
    return timesheetService.getTimesheet();
  }

  @PostMapping("/")
  public String saveEmployee(@RequestBody CreateTimesheetForm createTimesheetForm)
      throws ParseException {
    return timesheetService.saveTimesheet(createTimesheetForm);
  }

  @PutMapping("/")
  public String updateEmployee(@RequestBody UpdateTimesheetForm updateTimesheetForm)
      throws ParseException {
    return timesheetService.updateTimesheet(updateTimesheetForm);
  }

  @DeleteMapping(value = "/{id}")
  public String deleteTimesheet(@PathVariable Long id) {
    return timesheetService.deleteTimesheet(id);
  }

}
