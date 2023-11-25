package com.practice.ms.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.ms.webservice.domain.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer>{

}
