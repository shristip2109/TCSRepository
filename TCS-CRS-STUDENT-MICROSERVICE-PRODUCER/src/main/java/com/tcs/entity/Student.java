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
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentid;
	
	@Column(name = "studentname")
	private String studentname;
	
	@Column(name = "studentphone")
	private Integer studentphone;
	
	@Column(name = "studentemail")
	private String studentemail;
	
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Integer getStudentphone() {
		return studentphone;
	}
	public void setStudentphone(Integer studentphone) {
		this.studentphone = studentphone;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentphone=" + studentphone
				+ ", studentemail=" + studentemail + "]";
	}
}

