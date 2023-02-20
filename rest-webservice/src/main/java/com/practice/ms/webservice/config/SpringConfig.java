package com.practice.ms.webservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.practice.ms.webservice.interceptor.LogInterceptor;

@SuppressWarnings("deprecation")
@Component
public class SpringConfig extends WebMvcConfigurerAdapter {

	@Autowired
	LogInterceptor productServiceInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(productServiceInterceptor);
	}
}
