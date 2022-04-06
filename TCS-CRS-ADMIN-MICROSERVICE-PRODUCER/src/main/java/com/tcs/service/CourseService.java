package com.tcs.service;

/**
 * @author springuser19
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.tcs.entity.Course;

import com.tcs.repository.CourseRepository;



@Service
public class CourseService {
	@Autowired
	CourseRepository<Course> courseRepository;
	@Transactional
	public boolean addCourse(Course course) {
		return courseRepository.save(course) != null;	
		}
	
	@Transactional
	public void deleteCourse(Integer course) {
		courseRepository.deleteById(course);
		
	}
	
}
