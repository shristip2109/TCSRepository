package com.tcs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.tcs.model.Student;

public class StudentMapper implements  RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStudentid(rs.getInt("studentid"));
		student.setStudentname(rs.getString("studentname"));
		student.setStudentemail(rs.getString("studentemail"));
		student.setStudentphone(rs.getInt("studentphone"));
		return null;
	}

}
