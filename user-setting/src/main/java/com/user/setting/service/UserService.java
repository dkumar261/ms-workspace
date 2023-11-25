package com.user.setting.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.github.dozermapper.core.Mapper;
import com.user.setting.domain.User;
import com.user.setting.model.UserModel;
import com.user.setting.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private Mapper mapper;

	public UserModel createUser(UserModel userModel) {
		
		User user = mapper.map(userModel, User.class);
		String encodedPassword = passwordEncoder.encode(userModel.getPassword());
		user.setPassword(encodedPassword);
		user.setCreated(LocalDateTime.now());
		User savedUser = userRepository.save(user);

		UserModel returedUserModel = UserModel.builder().id(savedUser.getId()).name(savedUser.getName()).build();
		return returedUserModel;
	}
}
