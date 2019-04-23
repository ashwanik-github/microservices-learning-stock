package com.microservices.stock.dbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.stock.dbservice.model.Quotes;

public interface QuotesRepository extends JpaRepository<Quotes, Integer> {

	List<Quotes> findByUserName(String username);

}
