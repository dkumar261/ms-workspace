package com.practice.ms.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class PaylerController {

	@Autowired
	private PlayerService playerService;
	

	@PostMapping(value = "/ws/v1/player")
	public Player addPlayer(@RequestBody PlayerModel playerModel) {
		Player addPlayer = null;
		return addPlayer;

	}
}
