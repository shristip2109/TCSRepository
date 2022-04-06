/**
 * 
 */
package com.tcs.restcontroller;

import java.util.HashMap;
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

import com.tcs.dao.ProfessorDao;
import com.tcs.model.Grades;
/**
 * @author springuser10
 *
 */
@RestController
public class ProfessorController {
	
	@Autowired //The meaning of @Autowired is put the dependency injection at the Dao layer
	private ProfessorDao resultDAO;

	
//By Using this professor able to view the grades
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/grades")
		@ResponseBody
		public List getGrades() {
		return resultDAO.list();
	}
	
	//Using this method get details by details by id
		@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			    method = RequestMethod.GET,
			    value = "/grades/{id}")
			@ResponseBody
		public ResponseEntity getGrades(@PathVariable("id") Long id) {

			Grades grades = resultDAO.get(id);
			if (grades == null) {
				return new ResponseEntity("No result found for student ID " + id, HttpStatus.NOT_FOUND);
			}

			return new ResponseEntity(grades, HttpStatus.OK);
		}
		
	
// By Using this professor is able to view the Enrolled Students
		@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			    method = RequestMethod.GET,
			    value = "/enrolledstudents")
			@ResponseBody
			public List viewGrades() {
			return resultDAO.list();
		}
}
