package com.tcs.dao;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


=======
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Component;
>>>>>>> 159755fc3641ee7c4b24fdf59f7236b0a139b4e7

import com.tcs.mapper.ProfessorMapper;
import com.tcs.model.Course;
import com.tcs.model.Professor;
<<<<<<< HEAD
import java.util.List;

=======
//import com.tcs.model.ReportCard;

//import java.sql.Date;
import java.util.List;

import javax.ws.rs.core.MediaType;
>>>>>>> 159755fc3641ee7c4b24fdf59f7236b0a139b4e7

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author springuser19
 *
 */
@Repository
public class AdminDaoImpl implements AdminDao{
	
	// create the reference of logger here

	Logger logger = LoggerFactory.getLogger(AdminDaoImpl.class);

	// DI injection of JDBCTemplate

	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	//List of Professor
	@Override
<<<<<<< HEAD
=======
	@Transactional
>>>>>>> 159755fc3641ee7c4b24fdf59f7236b0a139b4e7
	public List<Professor> listProfessor() {
		// TODO Auto-generated method stub
				String SQL = "select * from professor";
				List<Professor> professors = jdbcTemplateObject.query(SQL, new ProfessorMapper());
				logger.debug("in debug");
				return professors;
		
	}

	//Add Professor details
	
	@Override
<<<<<<< HEAD
=======
	@Transactional
>>>>>>> 159755fc3641ee7c4b24fdf59f7236b0a139b4e7
	public Professor add(Professor professor) {
		// TODO Auto-generated method stub
			String professorDetails = "INSERT INTO PROFESSOR (pid,pname,pemail,pphone) values (?,?,?,?)";
			jdbcTemplateObject.update(professorDetails,professor.getPid(),professor.getPname(),
			professor.getPemail(),professor.getPphone());
			return professor;
			
		
	}
	
	//Add course details
	@Override
<<<<<<< HEAD
=======
	@Transactional
>>>>>>> 159755fc3641ee7c4b24fdf59f7236b0a139b4e7
	public Course add(Course course) {
		// TODO Auto-generated method stub
		String SQL = "insert into course (courseid,coursename) values (?,?)";
		jdbcTemplateObject.update(SQL,course.getCourseid(),course.getCoursename());
		return course;
	}
	

	
	//Delete course
	@Override
	public  Course delete(Integer courseid) {
		String deleteCourse = "delete from course where courseid = ?";
		jdbcTemplateObject.update(deleteCourse, courseid);
		
		return  null;
		
	}
	
}
