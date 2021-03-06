/**
 * 
 */
package com.tcs.model;

import java.io.Serializable;
import java.util.Date;
/**
 * @author springuser10
 *
 */
public class Grades implements Serializable {
	
	private Long id;
	private String studentName;
	private Long courseId;
	private String courseName;
	private String grade;
	private Date dateOfBirth;

	public Grades(long id, String studentName, long courseId, String courseName, String grade ) 
	{
		this.id = id ;
		this.studentName = studentName;
		this.courseId = courseId;
		this.courseName =courseName;
		this.grade = grade;
		this.dateOfBirth = new Date();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

}
