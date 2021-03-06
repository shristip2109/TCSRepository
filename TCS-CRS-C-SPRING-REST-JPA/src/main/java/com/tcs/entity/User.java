package com.tcs.entity;

public class User {
	private int id;
	private String userid;
	private String password;
	private int roleid;
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