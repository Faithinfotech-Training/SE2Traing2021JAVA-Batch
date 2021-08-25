package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.exception.ResourceNotFoundException;
import com.faith.app.model.ResourceEnquiry;
import com.faith.app.repository.ResourceEnquiryRepository;

@RestController
@RequestMapping("/api/")
public class ResourceEnquiryManagementController {
	
	@Autowired
	private ResourceEnquiryRepository resourceEnquiryRepository;
	
	
	//Get all the Resource Enquiries
	@GetMapping("/resource/enquiries")
	public List<ResourceEnquiry> getAllEnquiries(){
		
		return resourceEnquiryRepository.findAll();
		
	}
	
	//Get the Resource Enquire by ID
	@GetMapping("/resource/enquiry/{enquiryId}")
	public ResponseEntity<ResourceEnquiry> getEnquiryById(@PathVariable Long enquiryId){
		ResourceEnquiry enquiry=resourceEnquiryRepository.findById(enquiryId).orElseThrow(()->new ResourceNotFoundException("Entered ID is not present"));
		return ResponseEntity.ok(enquiry);
	}
	
	
	//Create Resource Enquire
	@PostMapping("/resource/enquiry")
	public ResourceEnquiry addEnquiry(@RequestBody ResourceEnquiry enquiry) {
		return resourceEnquiryRepository.save(enquiry);
	}
	
	
	//Update the Resource Enquire by ID
	@PutMapping("/resource/enquiry/{enquiryId}")
	public ResponseEntity<ResourceEnquiry> updateEnquiry(@PathVariable Long enquiryId,@RequestBody ResourceEnquiry enquiryDetails){
		
		  ResourceEnquiry enquiry=resourceEnquiryRepository.findById(enquiryId).orElseThrow(()->new ResourceNotFoundException("Entered ID is not present"));
		  
		  enquiry.setResourceId(enquiryDetails.getResourceId());
		  enquiry.setDate(enquiryDetails.getDate());
		  enquiry.setGuestId(enquiryDetails.getGuestId());
		 
		  
		  
		  ResourceEnquiry enquiryUpdate=resourceEnquiryRepository.save(enquiry);
		  return ResponseEntity.ok(enquiryUpdate);
		  
	
	}
	
	
	
	//Update the Enquiry status for particular ID
	@PutMapping("/resource/enquiry/{enquiryId}/status")
	public ResponseEntity<ResourceEnquiry> updateEnquiryStatus(@PathVariable Long enquiryId,@RequestBody ResourceEnquiry enquiryDetails){
		  
		  ResourceEnquiry enquiry=resourceEnquiryRepository.findById(enquiryId).orElseThrow(()->new ResourceNotFoundException("Entered ID is not present"));
		  
		  enquiry.setEnquiryStatus(enquiryDetails.getEnquiryStatus());
		  
		  ResourceEnquiry enquiryUpdate=resourceEnquiryRepository.save(enquiry);
		  return ResponseEntity.ok(enquiryUpdate);
	   
	}
	
//	@GetMapping("/resource/enquiry/{status}")
//	public ResponseEntity<ResourceEnquiryManagement> getEnquiryById(@PathVariable String status){
//		ResourceEnquiryManagement enquiry=resourceEnquiryRepository.findAll(status).orElseThrow(()->new ResourceNotFoundException("Entered ID is not present"));
//		return ResponseEntity.ok(enquiry);
//	}
	
	

}
