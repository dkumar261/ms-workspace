package com.practice.ms.webservice.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.dozermapper.core.Mapper;
import com.practice.ms.webservice.domain.Content;
import com.practice.ms.webservice.model.ContentModel;
import com.practice.ms.webservice.repository.ContentRepository;

@Service
public class ContentService {

	@Autowired
	private ContentRepository contentRepository;

	@Autowired
	private Mapper mapper;

	public Content createContent(ContentModel contentModel) {
		Content content = mapper.map(contentModel, Content.class);
		content.setCreateAt(LocalDateTime.now());
		contentRepository.save(content);
		return null;
	}
}
