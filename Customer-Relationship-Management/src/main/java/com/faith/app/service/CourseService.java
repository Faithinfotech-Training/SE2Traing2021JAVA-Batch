package com.faith.app.service;



import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faith.app.repository.CourseRepository;
import com.faith.app.model.Course;

@Service
public class CourseService {
	
	private CourseRepository courseRepository;
	
	public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
	}
       
	
	/** Create a new Course */
    	public ResponseEntity<Object> createCourse(Course model) {
    		
    		Course course = new Course();
    		
    		course.setCourse_name(model.getCourse_name());
    		course.setCourse_description(model.getCourse_description());
    		course.setCourse_duration(model.getCourse_duration());
    		course.setCourse_price(model.getCourse_price());
    		
            //save the record
            Course savedCourse= courseRepository.save(course);
    		
            if (courseRepository.findById(savedCourse.getCourse_id()).isPresent()) 
            	return ResponseEntity.ok("Course Successfully cretaed");
            else
            	return ResponseEntity.unprocessableEntity().body("Failed Creating Course as Specified");
            
    		
    	}
    	
    	
    	/** Update an Existing Course */
        @Transactional
        public ResponseEntity<Object> updateCourse(Course course, Long course_id) {
            if(courseRepository.findById(course_id).isPresent()) {
            	
                Course newCourse = courseRepository.findById(course_id).get();
                newCourse.setCourse_name(course.getCourse_name());
                newCourse.setCourse_description(course.getCourse_description());
                newCourse.setCourse_duration(course.getCourse_duration());
        		newCourse.setCourse_price(course.getCourse_price());
        		
                Course savedCourse = courseRepository.save(newCourse);
                if(courseRepository.findById(savedCourse.getCourse_id()).isPresent())
                    return  ResponseEntity.accepted().body("Course updated successfully");
                else return ResponseEntity.unprocessableEntity().body("Failed updating the course specified");
            } else return ResponseEntity.unprocessableEntity().body("Cannot find the course specified");
        }
        
        
    	
//    	/** Get course by Id **/
//        public CourseModel getCourse(Long course_id) {
//            if(courseRepository.findById(course_id).isPresent()) {
//                Course course = courseRepository.findById(course_id).get();
//                CourseModel courseModel = new CourseModel();
//                courseModel.setCourse_name(course.getCourse_name());
//                courseModel.setCourse_description(course.getCourse_description());
//                courseModel.setCourse_duration(course.getCourse_duration());
//                courseModel.setCourse_price(course.getCourse_price());
//                return courseModel;
//            } else return null;
//        }
//    	
//    	
//    	//get all course
//    	public List<CourseModel > getCourses(){
//    	
//    		List<Course> courseList=courseRepository.findAll();
//    		 if(courseList.size()>0) {
//    			 
//    			 List<CourseModel> courseModels = new ArrayList<>();
//    			 
//    			 for (Course course : courseList) {
//    				 CourseModel model = new CourseModel();
//    				 model.setCourse_name(course.getCourse_name());
//    				 model.setCourse_description(course.getCourse_description());
//    				 model.setCourse_duration(course.getCourse_duration());
//    				 model.setCourse_price(course.getCourse_price());
//    	             courseModels.add(model);
//    			 }
//    			 return courseModels;
//    		 }
//    		 else return new ArrayList<CourseModel>();
//    		
//    	}

    	
    	
    }


