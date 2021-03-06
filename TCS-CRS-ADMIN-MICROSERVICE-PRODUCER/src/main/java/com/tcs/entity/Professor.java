package com.tcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Professor")
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	
	@Column(name = "pname")
	private String pname;
	@Column(name = "pemail")
	private String pemail;
	@Column(name = "pphone")
	private Integer pphone;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public Integer getPphone() {
		return pphone;
	}
	public void setPphone(Integer pphone) {
		this.pphone = pphone;
	}
	@Override
	public String toString() {
		return "Professor [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + ", pphone=" + pphone + "]";
	}
	
	
	
}
