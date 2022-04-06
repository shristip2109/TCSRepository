package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.CourseEnrolled;
import com.tcs.repository.CourseEnrolledRepository;

@Service
public class CourseEnrolledService {

	@Autowired
	CourseEnrolledRepository<CourseEnrolled> courseEnrolledRepository;
	
	@Transactional
	public List<CourseEnrolled> findById(Integer pid) {
		return courseEnrolledRepository.findBypid(pid);
	}
	
}
