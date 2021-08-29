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

import com.faith.app.repository.CourseEnquiryRepository;
import com.faith.app.model.CourseEnquiry;
import com.faith.app.exception.CourseNotFoundException;;

@RestController
public class CourseEnquiryController {
	
	@Autowired
	private CourseEnquiryRepository courseEnquiryRepository;
	
	
	//Get all the Course Enquires
	@GetMapping("/api/course/enquiries")
	public List<CourseEnquiry> getAllEnquiries(){
		
		return courseEnquiryRepository.findAll();
		
	}
	
	//Get the Course Enquire by ID
	@GetMapping("/api/course/enquiry/{enquiryId}")
	public ResponseEntity<CourseEnquiry> getEnquiryById(@PathVariable Long enquiryId){
		CourseEnquiry enquiry=courseEnquiryRepository.findById(enquiryId).orElseThrow(()->new CourseNotFoundException("Entered ID is not present"));
		return ResponseEntity.ok(enquiry);
	}
	
	
	//Create Course Enquiry
	@PostMapping("/api/course/enquiry")
	public CourseEnquiry addEnquiry(@RequestBody CourseEnquiry enquiry) {
		return courseEnquiryRepository.save(enquiry);
	}
	
	
	//Update the Course Enquire by ID
	@PutMapping("/api/course/enquiry/{enquiryId}")
	public ResponseEntity<CourseEnquiry> updateEnquiry(@PathVariable Long enquiryId,@RequestBody CourseEnquiry enquiryDetails){
		
		CourseEnquiry enquiry=courseEnquiryRepository.findById(enquiryId).orElseThrow(()->new CourseNotFoundException("Entered ID is not present"));
		  
		  enquiry.setCourseId(enquiryDetails.getCourseId());
		  enquiry.setDate(enquiryDetails.getDate());
		  enquiry.setGuestId(enquiryDetails.getGuestId());
		  enquiry.setActive(enquiryDetails.isActive());
		  enquiry.setEnquiryStatus(enquiryDetails.getEnquiryStatus());
		 
		  
		  
		  CourseEnquiry enquiryUpdate=courseEnquiryRepository.save(enquiry);
		  return ResponseEntity.ok(enquiryUpdate);
		  
	
	}
	
	
	
	//Update the Enquiry status for particular ID
	@PutMapping("/resource/enquiry/{enquiryId}/status")
	public ResponseEntity<CourseEnquiry> updateEnquiryStatus(@PathVariable Long enquiryId,@RequestBody CourseEnquiry enquiryDetails){
		  
		CourseEnquiry enquiry=courseEnquiryRepository.findById(enquiryId).orElseThrow(()->new CourseNotFoundException("Entered ID is not present"));
		  
		  enquiry.setEnquiryStatus(enquiryDetails.getEnquiryStatus());
		  
		  CourseEnquiry enquiryUpdate=courseEnquiryRepository.save(enquiry);
		  return ResponseEntity.ok(enquiryUpdate);
	   
	}
}
	
