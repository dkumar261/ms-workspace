package com.user.setting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.setting.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> getUserByName(String name);

}
