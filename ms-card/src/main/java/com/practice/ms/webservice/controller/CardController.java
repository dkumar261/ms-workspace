package com.practice.ms.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.ms.webservice.model.Card;
import com.practice.ms.webservice.service.CardService;

@RestController
public class CardController {

	@Autowired
	private CardService cardService;

	@GetMapping(value = "/card/{id}")
	public Card greeting(@PathVariable("id") Integer id) {
		Card card = cardService.getGreetings(id);
		return card;
	}
}
