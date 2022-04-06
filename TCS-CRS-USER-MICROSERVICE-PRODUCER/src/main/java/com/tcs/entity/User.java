package com.tcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "userid")
	private String userid;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "roleid")
	private int roleid;
	
	@Column(name = "timestamp")
	private String timestamp;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the user_id
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setuserid(String userid) {
		this.userid = userid;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the roleId
	 */
	public int getRoleid() {
		return roleid;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleid) {
		this.roleid = roleid;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String toString() {
		return "Student [id=" + id + ", userId=" + userid + ", password=" + password + ", roleId=" + roleid
				+ ",timestamp+ = " + timestamp + "]";
	}

}
