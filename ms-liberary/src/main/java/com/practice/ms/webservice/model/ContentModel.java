package com.practice.ms.webservice.model;

import java.time.LocalDateTime;

import com.practice.ms.webservice.domain.ContentType;

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
public class ContentModel {

	private String name;
	private LocalDateTime createAt;
	private ContentType type;
}
