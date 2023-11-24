package com.user.setting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.setting.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
