package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

	/*
	 * @ExceptionHandler(value = ArithmeticException.class) public String
	 * arithmaticExceptionHandled() { return "Internal error occurred"; }
	 */

	@GetMapping("/calculate")
	public Integer calculate() {
		int a = 6;
		int b = 0;

		int res = a / b;

		return res;
	}

}
