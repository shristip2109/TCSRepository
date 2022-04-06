package com.tcs.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentid;
	
	@Column(name = "studentid")
	private Integer studentid;
	
	@Column(name = "courseid")
	private Integer courseid;
	
	@Column(name = "coursefee")
	private float coursefee;
	
	@Column(name = "paymentmode")
	private String paymentmode;
	
	@Column(name = "timestamp")
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

