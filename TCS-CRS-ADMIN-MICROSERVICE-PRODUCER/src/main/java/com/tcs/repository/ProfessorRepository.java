package com.tcs.repository;

import org.springframework.data.repository.CrudRepository;


import com.tcs.entity.Professor;


/**
 * @author springuser19
 *
 */
public interface ProfessorRepository<P> extends CrudRepository<Professor, Integer>  {

	
}
