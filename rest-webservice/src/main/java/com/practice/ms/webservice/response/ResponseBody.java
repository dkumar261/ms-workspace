package com.practice.ms.webservice.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.practice.ms.webservice.domain.Greeting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseBody {
	
	@JsonInclude(content = Include.NON_NULL)
	private Greeting greeting;
}
