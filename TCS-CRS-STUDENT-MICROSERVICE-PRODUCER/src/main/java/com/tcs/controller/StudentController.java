package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.CourseEnrolled;
import com.tcs.entity.Grade;
import com.tcs.entity.Student;
import com.tcs.service.CourseEnrolledService;
import com.tcs.service.GradeService;
import com.tcs.service.StudentService;

/**
 * @author springuser19
 *
 */
@RestController
public class StudentController {
	@Autowired
	CourseEnrolledService courseEnrolledService;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	GradeService  gradeService;
	
	@RequestMapping(value = "/courseenrolled", method = RequestMethod.POST)
	public HttpStatus insertCourseEnrolled(@RequestBody CourseEnrolled courseenrolled) {
		return courseEnrolledService.addCourseEnrolled(courseenrolled) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/courseenrolled/delete/{courseenroll}", method = RequestMethod.DELETE)
	public HttpStatus deleteCourseEnrolled(@PathVariable Integer courseenroll) {
		courseEnrolledService.deleteCourseEnrolled(courseenroll);
		return HttpStatus.NO_CONTENT;
	}
	
	
	@RequestMapping(value = "/gradeById/{studentid}", method = RequestMethod.GET)
	@ResponseBody
	public List<Grade> getGradeById( @PathVariable Integer studentid) {
		return  gradeService.findById(studentid);
	}
	
	
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public HttpStatus insertStudente(@RequestBody Student student) {
		return studentService.addStudent(student) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
}
