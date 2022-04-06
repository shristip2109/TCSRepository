package com.tcs.dao;

import java.util.List;

import com.tcs.model.User;

public interface UserDao {
	
	public User addUser(User user);
	public User deleteUser(Integer id);
	public List getUser(Integer id);

}
