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
import com.tcs.entity.Payment;
import com.tcs.entity.Student;
import com.tcs.service.CourseEnrolledService;
import com.tcs.service.GradeService;
import com.tcs.service.PaymentService;
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
	
	@Autowired
	PaymentService paymentServices;
	
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public HttpStatus insertStudente(@RequestBody Student student) {
		return studentService.addStudent(student) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/courseenrolled", method = RequestMethod.POST)
	public HttpStatus insertCourseEnrolled(@RequestBody CourseEnrolled courseenrolled) {
		return courseEnrolledService.addCourseEnrolled(courseenrolled) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/courseenrolled/delete/{courseenroll}", method = RequestMethod.DELETE)
	public HttpStatus deleteCourseEnrolled(@PathVariable Integer courseenroll) {
		courseEnrolledService.deleteCourseEnrolled(courseenroll);
		return HttpStatus.NO_CONTENT;
	}
	
	
	@RequestMapping(value = "/grade/{studentid}", method = RequestMethod.GET)
	@ResponseBody
	public List<Grade> getGradeById( @PathVariable Integer studentid) {
		return  gradeService.findById(studentid);
	}

	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	public HttpStatus insertPayment(@RequestBody Payment payment) {
		return paymentServices.addPayment(payment) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	
}
