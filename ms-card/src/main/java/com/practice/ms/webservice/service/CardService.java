package com.practice.ms.webservice.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.ms.webservice.model.Card;
import com.practice.ms.webservice.response.Greeting;

@Service
public class CardService {

	Map<String, Card> cards = new HashMap<>();
	{
		cards.put("hm", new Card(2));
		cards.put("ar", new Card(20));
		cards.put("gr", new Card(200));
	}

	@Autowired
	private RestTemplate restTemplate;

	public Card getGreetings(Integer id) {

		ResponseEntity<Greeting> responseEntity = restTemplate.getForEntity("http://localhost:8081/greeting/" + id,
				Greeting.class);
		Greeting greeting = responseEntity.getBody();

		String cardId = greeting.getCardId();
		Card card = cards.get(cardId);
		card.setMessage(greeting.getMessage());
		return card;
	}
}
