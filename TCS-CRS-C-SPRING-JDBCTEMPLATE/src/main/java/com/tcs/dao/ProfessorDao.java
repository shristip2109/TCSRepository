package com.tcs.dao;

import com.tcs.model.CourseEnrolled;
import com.tcs.model.Grades;

public interface ProfessorDao {
	
	/**
	 * This is the method to be used to initialize database resources ie.
	 * connection.
	 */

	public CourseEnrolled getStudent(Integer courseid);
	public Grades addgrade(Grades grades);
	
}
