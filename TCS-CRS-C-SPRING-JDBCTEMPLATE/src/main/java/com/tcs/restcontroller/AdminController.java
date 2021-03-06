package com.tcs.restcontroller;

import java.util.List;

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

<<<<<<< HEAD
import com.tcs.dao.AdminDaoImpl;
=======
import com.tcs.dao.AdminDao;
>>>>>>> 159755fc3641ee7c4b24fdf59f7236b0a139b4e7
import com.tcs.model.Course;
import com.tcs.model.Professor;
//import com.tcs.model.ReportCard;


/**
 * @author springuser21
 *
 */
@RestController
public class AdminController {
	
	@Autowired //The meaning of @Autowired is put the dependency injection at the Dao layer
<<<<<<< HEAD
	private AdminDaoImpl admindao;
=======
	private AdminDao admindao;
>>>>>>> 159755fc3641ee7c4b24fdf59f7236b0a139b4e7

	//Using this method to get details of Professor
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/professors")
		@ResponseBody
		public List getProfessors() {
			return admindao.listProfessor();
	}
	
	//Using this to Post Professor data
		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/professor")
		@ResponseBody
		public ResponseEntity ProfessorList(@RequestBody Professor professor) {

			professor=admindao.add(professor);
			return new ResponseEntity(professor, HttpStatus.OK);
		}
		
		
		//Using this to Post Course data
		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/courses")
		@ResponseBody
		public ResponseEntity addCourse(@RequestBody Course course) {

			course=admindao.add(course);
			return new ResponseEntity(course, HttpStatus.OK);
		}
		
	
		//Using this to Delete Course data by id
		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/delete/course/{courseid}")
		@ResponseBody
		public ResponseEntity deleteCourse(@PathVariable("courseid") Integer courseid) {

			if (null==admindao.delete(courseid)) {
				return new ResponseEntity("No student found for CourseID " + courseid, HttpStatus.NOT_FOUND);
			}

			return new ResponseEntity("Deleted Successfully" + " : " + courseid, HttpStatus.OK);

		}
			


}