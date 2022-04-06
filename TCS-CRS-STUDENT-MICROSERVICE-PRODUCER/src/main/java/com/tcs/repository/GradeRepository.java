package com.tcs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.Grade;


/**
 * @author springuser19
 *
 */
public interface GradeRepository<G> extends CrudRepository<Grade, Integer> {
	
	List<Grade> findBystudentid(Integer studentid);

}
