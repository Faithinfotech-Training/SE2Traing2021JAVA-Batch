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

import com.faith.app.repository.CourseRepository;
import com.faith.app.exception.CourseNotFoundException;
import com.faith.app.model.Course;




//@RestController
//public class CourseController{
//	
//	private UmarCourseService courseService;
//    private CourseRepository courseRepository;
//	
//	@Autowired
//    public CourseController(CourseService courseService, CourseRepository courseRepository) {
//        this.courseService = courseService;
//        this.courseRepository = courseRepository;
//    }
//    
//    /*Add Course*/
//    @PostMapping("/api/courses/add")
//    public ResponseEntity<Object> createUser(@RequestBody Course course) {
//    	
//    	return courseService.createCourse(course);
//    }
//    
//    //get all course
//    @GetMapping("/api/courses/all")
//    public List<Course> getCourses(){
//    	return courseRepository.findAll();
//    }
//    
////    @GetMapping("/api/courses/details/{id}")
////    public Course getUser(@PathVariable Long course_id) {
////
////    }
//    
//    @GetMapping("/api/courses/details/{course_id}")
//	public ResponseEntity<Course> getResourceById(@PathVariable Long course_id)
//	{
//		Course course=courseRepository.findById(course_id).orElseThrow(()-> new CourseNotFoundException(""));
//		return ResponseEntity.ok(course);
//	}
//    
//    @PutMapping("/api/courses/{id}")
//    public ResponseEntity<Object> updateCourse(@PathVariable Long id, @RequestBody Course course) {
//        return courseService.updateCourse(course, id);
//    }
//    
//}

