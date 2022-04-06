package com.tcs.restcontroller;

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
import com.tcs.service.CourseEnrolledService;
import com.tcs.service.GradeService;




/**
 * @author springuser19
 *
 */
@RestController
public class ProfessorController {

	@Autowired
	CourseEnrolledService  courseEnrolledService;
	
	@Autowired
	GradeService gradeService;
	
	@RequestMapping(value = "/gradeById/{pid}", method = RequestMethod.GET)
	@ResponseBody
	public List< CourseEnrolled> getById( @PathVariable Integer pid) {
		return courseEnrolledService.findById(pid);
	}
	
	@RequestMapping(value = "/grades", method = RequestMethod.POST)
	public HttpStatus insertGrade(@RequestBody Grade grades) {
		return gradeService.addGrade(grades) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
}
