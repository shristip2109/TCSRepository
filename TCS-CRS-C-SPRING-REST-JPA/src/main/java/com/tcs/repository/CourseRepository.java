package com.tcs.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.Course;


/**
 * @author springuser19
 *
 */
public interface CourseRepository<C> extends CrudRepository<Course, Integer>  {

}