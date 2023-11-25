package com.practice.ms.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.ms.webservice.domain.Content;
import com.practice.ms.webservice.model.ContentModel;
import com.practice.ms.webservice.service.ContentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/ws/liberary")
public class ContentController {

	@Autowired
	private ContentService contentService;

	@PostMapping(value = "/content")
	public Content addPlayer(@RequestBody ContentModel contentModel) {
		Content addPlayer = contentService.createContent(contentModel);
		return addPlayer;

	}
}
