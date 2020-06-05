package com.sk.helloboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sk.helloboot.model.School;
import com.sk.helloboot.repository.querydsl.SchoolRepositoryCustom;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long>, SchoolRepositoryCustom{

}
