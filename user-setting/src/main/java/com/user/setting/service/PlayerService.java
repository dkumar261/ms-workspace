package com.user.setting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.setting.domain.Player;
import com.user.setting.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public Player addPlayer(Player player) {
		Player save = playerRepository.save(player);
		return save;
	}
}
