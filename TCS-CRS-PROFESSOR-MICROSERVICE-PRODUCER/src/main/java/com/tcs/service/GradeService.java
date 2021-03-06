package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.Grade;
import com.tcs.repository.GradeRepository;


@Service
public class GradeService {

	@Autowired
	GradeRepository<Grade>gradeRepository;
	
	@Transactional
	public boolean addGrade(Grade grades) {
		return gradeRepository.save(grades) != null;	
		}
}
