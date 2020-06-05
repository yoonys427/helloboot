package com.sk.helloboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sk.helloboot.model.School;
import com.sk.helloboot.repository.SchoolRepository;

@RestController
public class SchoolController {
	
	@Autowired
	SchoolRepository schoolRepo;
	
	/*
	 * Create
	 */
	@RequestMapping(method = RequestMethod.POST, value="/school/add")
	public School addNewSchool(@RequestBody School school) {
		if(school == null)
			return null;
		if(school.getId() != null) {
			school.setId(null);
		}
		return schoolRepo.save(school);
	}
	
	/*
	 * Read
	 */
	@RequestMapping(method = RequestMethod.POST, value="/school/showAll")
	public List<School> findAllSchool() {
		return schoolRepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/school/find/{id}")
	public Optional<School> findSchoolById(@PathVariable Long id) {
		return schoolRepo.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/school/{id}")
	public School showSchoolById(@PathVariable Long id) {
		return schoolRepo.querydslFindById(id);
	}
	
	/*
	 * Update
	 */
	@RequestMapping(method = RequestMethod.POST, value="/school/update")
	public School updateSchool(@RequestBody School school) {
		if(school == null)
			return null;
		return schoolRepo.save(school);
	}
	
	/*
	 * Delete
	 */
	@RequestMapping(method = RequestMethod.POST, value="/school/delete/{id}")
	public List<School> deleteSchoolById(@PathVariable Long id) {
		schoolRepo.deleteById(id);
		return schoolRepo.findAll();
	}

}
