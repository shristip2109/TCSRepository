package com.tcs.model;

import java.sql.Timestamp;


public class Payment {
	
	
	private Integer paymentid;
	private Integer studentid;
	private Integer courseid;
	private float coursefee;
	private String paymentmode;
	private Timestamp timestamp;
	
	
	public Integer getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(Integer paymentid) {
		this.paymentid = paymentid;
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
	public float getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(float coursefee) {
		this.coursefee = coursefee;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "payment [paymentid=" + paymentid + ", studentid=" + studentid + ", courseid=" + courseid
				+ ", coursefee=" + coursefee + ", paymentmode=" + paymentmode + ", timestamp=" + timestamp + "]";
	}
	
	

}
