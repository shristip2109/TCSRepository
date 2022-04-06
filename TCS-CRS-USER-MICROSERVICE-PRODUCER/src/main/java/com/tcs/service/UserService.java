package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.User;
import com.tcs.repository.UserRepository;



public class UserService {

	@Autowired
	UserRepository<User> userRepository;
	
	@Transactional
	public boolean addUser (User user) {
		return userRepository.save(user) != null;	
		}
	
	@Transactional
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
		
	}
	
	public List<User> findById(Integer id) {
		return userRepository.findByid(id);
	}
}
