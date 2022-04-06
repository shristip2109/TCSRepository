package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.CourseEnrolled;
import com.tcs.repository.CourseEnrolledRepository;

/**
 * @author springuser19
 *
 */
@Service
public class CourseEnrolledService {
	@Autowired
	CourseEnrolledRepository<CourseEnrolled> courseEnrolledRepository;
	@Transactional
	public boolean addCourseEnrolled(CourseEnrolled courseenrolled) {
		return courseEnrolledRepository.save(courseenrolled) != null;	
		}
	@Transactional
	public void deleteCourseEnrolled(Integer courseenroll) {
		courseEnrolledRepository.deleteById(courseenroll);
		
	}



}
