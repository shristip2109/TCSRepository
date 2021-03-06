package com.tcs.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tcs.model.CourseEnrolled;
import com.tcs.model.Payment;
import com.tcs.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
Logger logger = LoggerFactory.getLogger(StudentDaoImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject; 

	
	public CourseEnrolled addcourseByStudent(CourseEnrolled courseenrolled) {
		String addcourse="insert into courseenrolled (courseenroll,courseid,studentid) values (?,?,?)";
		   jdbcTemplateObject.update(addcourse,courseenrolled.getCourseenroll(),courseenrolled.getCourseid(),courseenrolled.getStudentid());
		return courseenrolled;
	}

	@Override
	public CourseEnrolled deleteCourseByStudent(Integer courseenroll) {
		String deleteCourse = "delete from courseenrolled where courseid = ?";
		jdbcTemplateObject.update(deleteCourse, courseenroll);
		return null;
		
	}

	@Override
	public Student studentRegistration(Student student) {
		String addStudent="insert into student (studentid,studentname,studentemail,studentphone) values (?,?,?,?)";
		 jdbcTemplateObject.update(addStudent,student.getStudentid(),student.getStudentname(),student.getStudentemail(),student.getStudentphone());
		return student;
	}

	@Override
	public Payment addPayment(Payment payment) {
		String paymentMethod="insert into payment (paymentid,studentid,courseid,coursefee,paymentmode,timestamp) values (?,?,?,?,?,?)";
		 jdbcTemplateObject.update(paymentMethod,payment.getPaymentid(),payment.getStudentid(),payment.getCourseid(),payment.getCoursefee(),payment.getPaymentmode(),payment.getTimestamp());
		return payment;
	}

	@Override
	public List<Map<String, Object>> viewGrade(Integer studentid) {
		String SQL = "SELECT  c.coursename,g.marks,s.studentid FROM student s, course c, grades g WHERE g.studentid=s.studentid AND g.courseid = c.courseid and  s.studentid = ?";
		List<Map<String,Object>> grades = jdbcTemplateObject.queryForList(SQL,studentid);
		logger.debug("in debug");
		return grades;
	}

	
	
	

}
