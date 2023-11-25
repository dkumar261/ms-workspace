package com.practice.ms.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LiberaryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiberaryServiceApplication.class, args);
	}
}
