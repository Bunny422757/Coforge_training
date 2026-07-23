package com.coforge.dms.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //to handle global Exception
public class GlobalException {
	private Environment environment;

	@Autowired
	public GlobalException(Environment environment) {
		super();
		this.environment = environment;
	}

	@ExceptionHandler(DepartmentNotFoundException.class)
	public ResponseEntity<?> handleEmployeeNotFoundException(DepartmentNotFoundException e) {
		return new ResponseEntity<>(environment.getProperty("dms.invalid.department-details"),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		return new ResponseEntity<>(environment.getProperty("dms.invalid.department-details"),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception e) {
		return new ResponseEntity<>(environment.getProperty("dms.db.failed"),HttpStatus.BAD_REQUEST);
	}
}
