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

import com.tcs.dao.StudentDaoImpl;
import com.tcs.model.CourseEnrolled;
import com.tcs.model.Payment;
import com.tcs.model.Student;

@RestController
public class StudentController {

	@Autowired

	private StudentDaoImpl studentDao;

	/**
	 * Post student data
	 * 
	 * @param student object
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/student")
	@ResponseBody
	public ResponseEntity addStudent(@RequestBody Student student) {
		studentDao.studentRegistration(student);
		return new ResponseEntity(student, HttpStatus.OK);

	}
	
	/**
	 * Post Course data
	 * 
	 * @param  CourseEnrolled object.
	 */
	 
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/addcourse")
	@ResponseBody
	public ResponseEntity addCourse(@RequestBody CourseEnrolled courseenrolled) {

		studentDao.addcourseByStudent(courseenrolled);

		return new ResponseEntity(courseenrolled, HttpStatus.OK);

	}
	
	/**
	 * Delete course Data
	 * 
	 * @param  courseenroll
	 * @throws No course found for courseenroll
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/delete/course/{courseenroll}")
	@ResponseBody
	public ResponseEntity deleteStudentCourses(@PathVariable int courseenroll) {
		studentDao.deleteCourseByStudent(courseenroll);
		return new ResponseEntity("Deleted Successfully" + " : " + courseenroll, HttpStatus.OK);

	}
	
	/**
	 * Get Student Grade
	 * 
	 * @param studentid
	 * @throws No User found for studentId
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/get/student/grade/{studentid}")
	@ResponseBody
	public ResponseEntity getResult(@PathVariable int studentid) {
		List<Map<String, Object>> grade = studentDao.viewGrade(studentid);
		return new ResponseEntity(grade, HttpStatus.OK);

	}
	
	
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/addpayment")
	@ResponseBody
	public ResponseEntity addPayment(@RequestBody Payment payment) {
		studentDao.addPayment(payment);
		return new ResponseEntity(payment, HttpStatus.OK);

	}
	
	
	
	
}
