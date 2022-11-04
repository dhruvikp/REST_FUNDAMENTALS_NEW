package com.simplilearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.exception.RecordNotFoundException;

@RestController
public class ReadEmployeeController {

	@GetMapping("/readEmployees")
	public void readEmployee() throws RecordNotFoundException {
		List<String> employees = new ArrayList<>();
		// Write your code to retrieve data from DB.

		if (employees.isEmpty()) {
			throw new RecordNotFoundException();
		}
	}
}
