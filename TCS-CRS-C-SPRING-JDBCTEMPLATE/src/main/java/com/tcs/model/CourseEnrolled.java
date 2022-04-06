package com.tcs.model;

public class CourseEnrolled {

<<<<<<< HEAD
	private Integer courseenroll;
	private Integer courseid;
	private Integer studentid;
	private Integer pid;
	public Integer getCourseenroll() {
		return courseenroll;
	}
	public void setCourseenroll(Integer courseenroll) {
		this.courseenroll = courseenroll;
=======
	private Integer courseenrolled;
	private Integer courseid;
	private Integer studentid;
	private Integer pid;
	public Integer getCourseenrolled() {
		return courseenrolled;
	}
	public void setCourseenrolled(Integer courseenrolled) {
		this.courseenrolled = courseenrolled;
>>>>>>> 159755fc3641ee7c4b24fdf59f7236b0a139b4e7
	}
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
	
	@Override
	public String toString() {
<<<<<<< HEAD
		return "CourseEnrolled [courseenroll=" + courseenroll + ", courseid=" + courseid + ", studentid="
=======
		return "CourseEnrolled [courseenrolled=" + courseenrolled + ", courseid=" + courseid + ", studentid="
>>>>>>> 159755fc3641ee7c4b24fdf59f7236b0a139b4e7
				+ studentid +", pid"+ pid+ "]";
	}
}
