package com.tcs.mapper;


import java.sql.ResultSet;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.tcs.model.Course;

/**
 * @author shris
 *
 */
public class CourseMapper implements RowMapper<Course>{
	

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Course course = new Course();
		course.setCourseid(rs.getInt("courseid"));
		course.setCoursename(rs.getString("coursename"));
		return course;

	}

}