package com.sk.helloboot.repository.querydsl;

import org.springframework.stereotype.Repository;

import com.sk.helloboot.model.School;

@Repository
public interface SchoolRepositoryCustom {
	
	School querydslFindById(Long id);

}
