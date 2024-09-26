package com.faith.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.faith.app.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

	//Optional <Course> findByCourse_name(String course_name);
	
	//@Query(value = "select * from course_management", nativeQuery = true)
	//List<Course> findAllByCourse_id();
	
}
