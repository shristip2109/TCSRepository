package com.tcs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tcs.model.CourseEnrolled;

public class CourseEnrolledMapper implements  RowMapper<CourseEnrolled>{
	
	public CourseEnrolled mapRow (ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		CourseEnrolled courseenrolled = new CourseEnrolled();
		courseenrolled.setStudentid(rs.getInt("studentid"));
		courseenrolled.setCourseid(rs.getInt("courseid"));
		courseenrolled.setPid(rs.getInt("pid"));
		
		return courseenrolled;
		

	}

}
