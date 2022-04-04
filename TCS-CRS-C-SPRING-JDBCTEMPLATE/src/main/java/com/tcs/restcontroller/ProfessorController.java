package com.tcs.restcontroller;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.dao.ProfessorDaoImpl;
import com.tcs.model.CourseEnrolled;
import com.tcs.model.Grades;

/**
 * @author springuser01
 *
 */
@RestController
public class ProfessorController {
	@Autowired
	private ProfessorDaoImpl professorDAO;
	
	
	/**
	 * Get Student List
	 * 
	 */

	//Using this method get details of course enrolled by id
			@RequestMapping(produces = MediaType.APPLICATION_JSON, 
				    method = RequestMethod.GET,
				    value = "/courseenrolled/{courseid}")
				@ResponseBody
			public ResponseEntity getCourseEnrolled(@PathVariable("courseid") Integer courseid) {

				CourseEnrolled course = professorDAO.getStudent(courseid);
				if (course == null) {
					return new ResponseEntity("No Customer found for ID " + courseid, HttpStatus.NOT_FOUND);
				}

				return new ResponseEntity(course, HttpStatus.OK);
			}	

	/**
	 * Post Grade of student
	 * 
	 */

			//Using this to Post Professor data
			@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/grades")
			@ResponseBody
			public ResponseEntity addGrade(@RequestBody Grades grades) {

				grades=professorDAO.addgrade(grades);
				return new ResponseEntity(grades, HttpStatus.OK);
			}
	

}
