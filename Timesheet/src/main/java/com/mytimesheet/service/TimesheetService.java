package com.mytimesheet.service;

import java.text.ParseException;
import java.util.List;

import com.mytimesheet.model.Timesheet;

public interface TimesheetService {
	
	List <Timesheet> getAllTimesheet() throws ParseException;
}
