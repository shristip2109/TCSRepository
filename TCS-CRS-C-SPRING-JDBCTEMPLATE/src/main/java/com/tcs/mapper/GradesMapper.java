package com.tcs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tcs.model.Grades;

public class GradesMapper implements  RowMapper<Grades>{
	
	public Grades mapRow (ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Grades grades = new Grades();
		grades.setStudentid(rs.getInt("studentid"));
		grades.setCourseid(rs.getInt("courseid"));
		grades.setMarks(rs.getString("marks"));
		grades.setPid(rs.getInt("pid"));
		
		return grades;
		

	}

}
