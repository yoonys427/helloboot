package com.sk.helloboot.repository.querydsl.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sk.helloboot.model.QSchool;
import com.sk.helloboot.model.School;
import com.sk.helloboot.repository.querydsl.SchoolRepositoryCustom;

public class SchoolRepositoryImpl implements SchoolRepositoryCustom{
	
	@Autowired
	private JPAQueryFactory queryFactory;

	@Override
	public School querydslFindById(Long id) {
		QSchool school = QSchool.school;
		JPAQuery<School> query=queryFactory.selectFrom(school).where(school.id.eq(id));
		return query.fetchOne();
	}
}
