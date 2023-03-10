package com.practice.ms.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.ms.webservice.domain.Greeting;
import com.practice.ms.webservice.service.GreetingService;
import com.practice.ms.webservice.util.ApplicationConstants;
/**
 * 
 * @author Dinesh Kumar
 *
 */
@RestController
@RequestMapping(path = ApplicationConstants.GREETING)
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping(value = "/greeting/{id}")
	public Greeting greeting(@PathVariable("id") Integer id) {
		Greeting greeting = greetingService.getGreetings(id);
		return greeting;
	}
	
}
