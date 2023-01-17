package com.practice.ms.webservice.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.practice.ms.webservice.domain.Greeting;

@Service
public class GreetingService {

	Map<Integer, Greeting> greetings = new HashMap<>();
	{
		greetings.put(1, new Greeting("Happy Diwali !!", new Date(), "hm"));
		greetings.put(2, new Greeting("Happy New Year !!", new Date(), "ar"));
		greetings.put(3, new Greeting("Happy Holi !!", new Date(), "gr"));
	}

	public Greeting getGreetings(Integer id) {
		return greetings.get(id);
	}
}
