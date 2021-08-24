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
import com.faith.app.model.ResourceManagement;
import com.faith.app.repository.ResourceRepository;

@RestController
@RequestMapping("/api/")
public class ResourceManagementController {
	
	@Autowired
	private ResourceRepository resourceRepository;
	
	// Get All Resources
	@GetMapping("/resource")
	public List<ResourceManagement> getAllResources()
	{
		return resourceRepository.findAll();
	}
	
	
	
	
	//Add the Resource
	@PostMapping("/resource")
	public ResourceManagement addResource(@RequestBody ResourceManagement resource)
	{
		return resourceRepository.save(resource);
	}
	
	
	
	// Get the Resource by ID
	@GetMapping("/resource/{resourceId}")
	public ResponseEntity<ResourceManagement> getResourceById(@PathVariable Long resourceId)
	{
		ResourceManagement resource=resourceRepository.findById(resourceId).orElseThrow(()-> new ResourceNotFoundException(""));
		
		return ResponseEntity.ok(resource);
	}
	
	
	
	//Update the Resource by ID
	@PutMapping("/resource/{resourceId}")
	public ResponseEntity<ResourceManagement> updateResource(@PathVariable Long resourceId,@RequestBody ResourceManagement resourceDetails){
		
		ResourceManagement resource=resourceRepository.findById(resourceId).orElseThrow(()-> new ResourceNotFoundException(""));
		
		resource.setResourceName(resourceDetails.getResourceName());
		resource.setResourceType(resourceDetails.getResourceType());
		resource.setMaxCapacity(resourceDetails.getMaxCapacity());
		resource.setAvaliableCapacity(resourceDetails.getAvaliableCapacity());
		resource.setActive(resourceDetails.isActive());
		
		ResourceManagement updateResource=resourceRepository.save(resource);
		
		return ResponseEntity.ok(updateResource);
		
	}
	

}
