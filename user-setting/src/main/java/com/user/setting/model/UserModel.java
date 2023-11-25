package com.user.setting.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserModel {

	private Integer id;

	@JsonProperty
	@JsonInclude(content = Include.NON_NULL)
	private String name;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	private String confirmedpassword;
	
	private String emial;
	private Long mobile;
	
	private LocalDateTime created;
	
}
