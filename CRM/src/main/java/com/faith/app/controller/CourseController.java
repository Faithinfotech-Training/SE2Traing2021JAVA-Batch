package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.dao.CourseRepository;
import com.faith.app.dto.CourseModel;
import com.faith.app.entity.Course;
import com.faith.app.service.CourseService;


@RestController
public class CourseController{
	
	private CourseService courseService;
    private CourseRepository courseRepository;
	
	@Autowired
    public CourseController(CourseService courseService, CourseRepository courseRepository) {
        this.courseService = courseService;
        this.courseRepository = courseRepository;
    }
    
    /*Add Course*/
    @PostMapping("/api/courses")
    public ResponseEntity<Object> createUser(@RequestBody Course course) {
    	
    	return courseService.createCourse(course);
    }
    
    //get all course
    @GetMapping("/api/courses/all")
    public List<CourseModel> getCourses(){
    	return courseService.getCourses();
    }
    
    @GetMapping("/api/courses/{id}")
    public CourseModel getUser(@PathVariable Long course_id) {
        return courseService.getCourse(course_id);
    }
    
    @PutMapping("/api/courses/{id}")
    public ResponseEntity<Object> updateCourse(@PathVariable Long id, @RequestBody Course course) {
        return courseService.updateCourse(course, id);
    }
    
}

