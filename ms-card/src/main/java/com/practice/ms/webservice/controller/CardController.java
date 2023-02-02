package com.practice.ms.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.ms.webservice.model.Card;
import com.practice.ms.webservice.service.CardService;
import com.practice.ms.webservice.util.CardServiceConstants;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = CardServiceConstants.GREETING)
@Slf4j
public class CardController {

	@Autowired
	private CardService cardService;

	@GetMapping(value = "/card/{id}")
	@CircuitBreaker(name = "greetingBreaker", fallbackMethod = "greetingFallBack")
	public Card greeting(@PathVariable("id") Integer id) {
		Card card = cardService.getGreetings(id);
		return card;
	}

	public Card greetingFallBack(Integer id, Exception ex) {
		log.info("----Fallback method is called----" + ex.getMessage());
		Card card = new Card(2222);
		return card;
	}
}
