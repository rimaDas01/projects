package com.mytimesheet.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytimesheet.model.Timesheet;
import com.mytimesheet.service.TimesheetService;

@RestController
@RequestMapping("/timesheet")
public class TimesheetController {
	
	@Autowired
	private TimesheetService timesheetService;
	
	@GetMapping ( "/getall")
	public List<Timesheet> getAllTimesheet() throws ParseException {
		return timesheetService.getAllTimesheet();
	}
	
	
}
