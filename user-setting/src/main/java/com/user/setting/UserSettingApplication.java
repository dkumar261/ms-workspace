package com.user.setting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Dinesh Kumar
 */
@EnableEurekaClient
@SpringBootApplication
public class UserSettingApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserSettingApplication.class, args);
	}
}
