package com.hamarabank.bean;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class DateBean {
	
	    public LocalDate printDate() {
	        LocalDate dt = LocalDate.from(ZonedDateTime.now());
	        return dt;
	    }
}
