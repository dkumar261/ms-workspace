package com.practice.ms.webservice.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.ms.webservice.domain.Greeting;
import com.practice.ms.webservice.model.GreetingModel;
import com.practice.ms.webservice.repository.GreetingRepository;

@Service
public class GreetingService {

	@Autowired
	private GreetingRepository greetingRepository;

	public GreetingModel getGreetings(Integer id, Integer typeId) {
		Optional<Greeting> Optionalgreeting = greetingRepository.findGreetingByIdAndType(id, typeId);
		GreetingModel greetingModel = new GreetingModel();

		if (Optionalgreeting.isPresent()) {
			Greeting greeting = Optionalgreeting.get();
			greetingModel.setCreateDate(greeting.getCreateDate());
			greetingModel.setMessage(greeting.getMessage());
			greetingModel.setId(greeting.getId());
			greetingModel.setBrand(greeting.getBrand());
			greetingModel.setType("CARD");
		}
		return greetingModel;
	}

	public Greeting save(Greeting greeting) {
		greeting.setCreateDate(new Date());
		Greeting savedGreeting = greetingRepository.save(greeting);
		return savedGreeting;

	}
}
