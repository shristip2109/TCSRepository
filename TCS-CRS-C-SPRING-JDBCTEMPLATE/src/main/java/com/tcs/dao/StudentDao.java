package com.tcs.dao;

import java.util.List;
import java.util.Map;

import com.tcs.model.CourseEnrolled;
import com.tcs.model.Payment;
import com.tcs.model.Student;

public interface StudentDao {
	
	public CourseEnrolled addcourseByStudent(CourseEnrolled courseenrolled);
	public  CourseEnrolled deleteCourseByStudent(Integer courseenroll);
	public Student studentRegistration(Student student);
	public List<Map<String, Object>> viewGrade(Integer studentid);
	public Payment addPayment(Payment payment);

}
