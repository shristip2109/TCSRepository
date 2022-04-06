package com.tcs.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcs.entity.User;
import com.tcs.service.UserService;

public class UserManagementController {
	UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public HttpStatus insertUsere(@RequestBody User user) {
		return userService.addUser(user) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
		return HttpStatus.NO_CONTENT;
	}
	
	@RequestMapping(value = "/userById/{id}", method = RequestMethod.GET)
	@ResponseBody
	public List<User> getGradeById( @PathVariable Integer id) {
		return  userService.findById(id);
	}

}
