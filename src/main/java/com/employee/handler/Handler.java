package com.employee.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employee.excep.SalaryNotException;

@RestControllerAdvice
public class Handler {
	@ExceptionHandler(SalaryNotException.class)
	public ResponseEntity<Object> SalaryHandler(){
		return new ResponseEntity<Object>("Invalid Salary",HttpStatus.BAD_REQUEST);
	}
	
	

}
