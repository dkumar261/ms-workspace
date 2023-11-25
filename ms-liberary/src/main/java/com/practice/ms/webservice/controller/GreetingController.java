package com.practice.ms.webservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.ms.webservice.domain.Greeting;
import com.practice.ms.webservice.model.GreetingModel;
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

	@GetMapping(value = "/item/{itemId}/article/{articleId}")
	public GreetingModel greeting(@PathVariable("articleId") Integer id, @PathVariable("itemId") Integer typeId) {
		GreetingModel greeting = greetingService.getGreetings(id, typeId);
		return greeting;
	}

	@PostMapping(value = "/item")
	public Greeting add(@RequestBody Greeting greeting) {
		Greeting savedGreeting = greetingService.save(greeting);
		return savedGreeting;
	}

	@GetMapping(value = "/item/call")
	public String users(@Valid @RequestHeader("u-name") String name) {
		return "This is Greeting !!";
	}
}