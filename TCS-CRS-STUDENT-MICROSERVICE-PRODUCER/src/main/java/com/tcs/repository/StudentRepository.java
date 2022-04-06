package com.tcs.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.Student;

/**
 * @author springuser19
 *
 */
public interface StudentRepository<S> extends CrudRepository< Student, Integer> {
	/**
	 *this method is used to register 
	 *
	 */
	

}