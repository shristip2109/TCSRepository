package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.Grade;
import com.tcs.repository.GradeRepository;

/**
 * @author springuser19
 *
 */
@Service
public class GradeService {
	
	
	@Autowired
	GradeRepository<Grade>gradeRepository;
	@Transactional
	public List<Grade> findById(Integer studentid) {
		return gradeRepository.findBystudentid(studentid);
	}
}