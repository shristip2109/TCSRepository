package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tcs.entity.Course;
import com.tcs.entity.Professor;
import com.tcs.service.ProfessorService;
import com.tcs.service.CourseService;
/**
 * @author springuser08
 *
 */
public class AdminController {
	@Autowired
	ProfessorService professorService;
	
	@Autowired
	CourseService courseService;
	
			@RequestMapping(value = "/professor", method = RequestMethod.POST)
			public HttpStatus insertProfessor(@RequestBody Professor professor) {
				return professorService.addProfessor(professor) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
			}
		
			@RequestMapping(value = "/course", method = RequestMethod.POST)
			public HttpStatus insertCourse(@RequestBody Course course) {
				return courseService.addCourse(course) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
			}
			@RequestMapping(value = "/course/delete/{courseid}", method = RequestMethod.DELETE)
			public HttpStatus deleteCourse(@PathVariable Integer course) {
				courseService.deleteCourse(course);
				return HttpStatus.NO_CONTENT;
			}
			
			
       
}

