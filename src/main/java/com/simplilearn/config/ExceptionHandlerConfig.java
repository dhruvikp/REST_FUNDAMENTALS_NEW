package com.simplilearn.config;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.simplilearn.exception.RecordNotFoundException;

@Component
@RestControllerAdvice
public class ExceptionHandlerConfig {

	@ExceptionHandler(value = ArithmeticException.class)
	public String arithmaticExceptionHandled() {
		return "Internal error occurred Globally";
	}
	
	
	@ExceptionHandler(value = RecordNotFoundException.class)
	public String recordNotFoundException() {
		return "Record not found in DB.";
	}
	
	
}
