package com.faith.app.service;

import java.util.List;

import com.faith.app.model.Course;

public interface CourseEnquiryService {

	// get all courses
	public List<Course> findAllCourses();
	
	// get course by id
	public Course findCourseById(int courseId);
	
	// add a course
	public void save(Course course);
	
	// delete a course
	public void deleteCourseById(int courseId);
	
	//List public courses
	List<Course> findAllPublicCourses();
}
