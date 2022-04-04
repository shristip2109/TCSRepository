package com.tcs.model;

public class Grades {
	
	private Integer gradeno;
	private Integer studentid;
	private Integer courseid;
	private String marks;
	private Integer pid;
	
	public Integer getGradeno() {
		return gradeno;
	}
	public void setGradeno(Integer gradeno) {
		this.gradeno = gradeno;
	}
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public Integer getCourseid() {
		return courseid;
	}
	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	@Override
	public String toString() {
		return "Grade [studentid=" + studentid + ", courseid=" + courseid + ", marks=" + marks + ", pid=" + pid +"]";
	}
	
}
