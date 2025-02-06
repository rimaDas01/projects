package com.mycompany.springdatarest.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionInformation> exceptionHandler(Exception exception){
	ExceptionInformation info=new ExceptionInformation();
	info.setMessage(exception.getMessage());
	info.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
	info.setTimestamp(LocalDateTime.now());
	return new ResponseEntity<ExceptionInformation>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	
}
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<ExceptionInformation> exceptionHandler(EmployeeException exception){
	ExceptionInformation info=new ExceptionInformation();
	info.setMessage(exception.getMessage());
	info.setCode(HttpStatus.NOT_FOUND.value());
	info.setTimestamp(LocalDateTime.now());
	return new ResponseEntity<ExceptionInformation>(info,HttpStatus.INTERNAL_SERVER_ERROR);
}
}
