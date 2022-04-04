package com.tcs.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.mapper.CourseEnrolledMapper;
import com.tcs.model.CourseEnrolled;
import com.tcs.mapper.GradesMapper;
import com.tcs.model.Grades;

@Repository
public class ProfessorDaoImpl implements ProfessorDao{
	
	Logger logger = LoggerFactory.getLogger(ProfessorDaoImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject; 
	
	public CourseEnrolled getStudent(Integer courseid) {

		String SQL = "select * from professor where courseid = ?";
		CourseEnrolled coursedetails  = jdbcTemplateObject.queryForObject(SQL, new Object[] { courseid }, new  CourseEnrolledMapper());
		logger.debug("value", jdbcTemplateObject.queryForObject(SQL, new Object[] { courseid }, new  CourseEnrolledMapper()));
		logger.debug("value of emp-->" + coursedetails.toString());
		return coursedetails;
		
	}

	//Add grades
		@Override
		@Transactional
		public Grades addgrade(Grades grades) {
			// TODO Auto-generated method stub
			String SQL = "insert into grades (studentid,courseid,marks,pid) values (?,?,?,?)";
			jdbcTemplateObject.update(SQL,grades.getStudentid(),grades.getCourseid(),grades.getMarks(),grades.getPid());
			return grades;
		}
}
