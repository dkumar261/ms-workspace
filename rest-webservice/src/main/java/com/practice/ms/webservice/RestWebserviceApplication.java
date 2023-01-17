package com.practice.ms.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RestWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWebserviceApplication.class, args);
	}
}
