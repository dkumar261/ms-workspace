package com.practice.ms.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public Player addPlayer(Player player) {
		Player save = playerRepository.save(player);
		return save;
	}
}
