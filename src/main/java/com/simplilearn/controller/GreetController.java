package com.simplilearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.pojo.Greet;

// @RestController = @Controller + @ResponseBody
@RestController
public class GreetController {

	// @GetMapping("/greet")
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public Greet greetMe() {
		Greet greet = new Greet();
		greet.setName("Dhruvik");
		greet.setMessage("Hello Simplilearn Learners!");
		return greet;
	}
}
