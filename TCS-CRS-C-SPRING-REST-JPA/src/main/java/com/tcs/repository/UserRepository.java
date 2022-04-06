package com.tcs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.User;



public interface UserRepository<U> extends CrudRepository<User, Integer>{
	List<User> findByid(Integer id);

}
