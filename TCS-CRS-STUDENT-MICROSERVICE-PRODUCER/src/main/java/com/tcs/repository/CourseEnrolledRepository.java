package com.tcs.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.CourseEnrolled;


/**
 * @author springuser19
 *
 */
public interface CourseEnrolledRepository<C> extends CrudRepository<CourseEnrolled, Integer>  {

}
