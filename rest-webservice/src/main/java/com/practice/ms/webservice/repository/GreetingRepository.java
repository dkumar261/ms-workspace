package com.practice.ms.webservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.ms.webservice.domain.Greeting;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Integer> {

	public Optional<Greeting> findGreetingByIdAndType(Integer id, Integer typeId);
}
