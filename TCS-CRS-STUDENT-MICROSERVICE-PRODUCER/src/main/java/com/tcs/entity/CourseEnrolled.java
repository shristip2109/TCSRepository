package com.tcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author springuser19
 *
 */
@Entity
@Table(name = "courseenrolled")
public class CourseEnrolled {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseenroll;
	
	@Column(name = "courseid")
	private Integer courseid;
	
	@Column(name = "studentid")
	private Integer studentid;
	
	@Column(name = "pid")
	private Integer pid;
	
	
	public Integer getCourseid() {
		return courseid;
	}
	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getCourseenroll() {
		return courseenroll;
	}
	public void setCourseenroll(Integer courseenroll) {
		this.courseenroll = courseenroll;
	}
	
	

}

