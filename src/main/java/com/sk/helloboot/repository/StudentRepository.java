package com.sk.helloboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sk.helloboot.model.Student;
import com.sk.helloboot.repository.querydsl.StudentRepositoryCustom;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>, StudentRepositoryCustom {
	
//	List<Student> findByEmail(String condition);

}
