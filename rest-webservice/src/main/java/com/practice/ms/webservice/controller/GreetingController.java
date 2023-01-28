package com.practice.ms.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.ms.webservice.domain.Greeting;
import com.practice.ms.webservice.response.ResponseBody;
import com.practice.ms.webservice.service.GreetingService;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping(value = "/greeting/{id}")
	
	public ResponseEntity<ResponseBody> greeting(@PathVariable("id") Integer id) {
		Greeting greeting = null;
		try {
			 greeting = greetingService.getGreetings(id);
		} catch (Exception e) {
			return new ResponseEntity<ResponseBody>(null);
		}
		return new ResponseEntity<ResponseBody>(new ResponseBody(greeting) , HttpStatus.OK);
	}
}
