package com.mytimesheet.serviceImpl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytimesheet.model.Timesheet;
import com.mytimesheet.repository.TimesheetRepository;
import com.mytimesheet.service.TimesheetService;

@Service
public class TimesheetServiceImpl implements TimesheetService{
	
	@Autowired
	private TimesheetRepository timesheetRepository;

	@Override
	public List<Timesheet> getAllTimesheet() throws ParseException {
		// TODO Auto-generated method stub
		
		List<Timesheet> timesheetList = (List<Timesheet>) timesheetRepository.findAll();
		return timesheetList;
	}

}
