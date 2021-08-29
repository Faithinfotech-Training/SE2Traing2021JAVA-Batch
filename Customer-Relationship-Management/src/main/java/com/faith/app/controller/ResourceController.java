package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.exception.ResourceNotFoundException;
import com.faith.app.model.Resource;
import com.faith.app.repository.ResourceRepository;

@RestController
@RequestMapping("/api/")
public class ResourceController {
	
	@Autowired
	private ResourceRepository resourceRepository;
	
	AuthController obj = new AuthController();
	
	// Get All Resources
	@GetMapping("/resource")
	public List<Resource> getAllResources()
	{
		return resourceRepository.findAll();
	}
	
	
	//Add the Resource
	@PostMapping("/resource")
	public Resource addResource(@RequestBody Resource resource)
	{
		return resourceRepository.save(resource);
	}
	
	
	// Get the Resource by ID
	@GetMapping("/resource/{resourceId}")
	public ResponseEntity<Resource> getResourceById(@PathVariable Long resourceId)
	{
		Resource resource=resourceRepository.findById(resourceId).orElseThrow(()-> new ResourceNotFoundException(""));
		
		return ResponseEntity.ok(resource);
	}
	
	
	
	//Update the Resource by ID	
	@PutMapping("/resource/{resourceId}")
	public ResponseEntity<Resource> updateResource(@PathVariable Long resourceId,@RequestBody Resource resourceDetails){
		
		Resource resource=resourceRepository.findById(resourceId).orElseThrow(()-> new ResourceNotFoundException(""));
		
		resource.setResourceName(resourceDetails.getResourceName());
		resource.setResourceType(resourceDetails.getResourceType());
		resource.setMaxCapacity(resourceDetails.getMaxCapacity());
		resource.setAvaliableCapacity(resourceDetails.getAvaliableCapacity());
		resource.setActive(resourceDetails.isActive());
		
		Resource updateResource=resourceRepository.save(resource);
		
		return ResponseEntity.ok(updateResource);
		
	}
//  trial-works!
//	@PutMapping("/resource")
//	public Resource updateResource(@RequestBody Resource resource)
//	{
//		return resourceRepository.save(resource);
//	}
	
	@DeleteMapping("/resource/{resourceId}")
	public void deleteResource(@PathVariable Long resourceId) {
		Resource resource = resourceRepository.findById(resourceId).orElseThrow(()-> new RuntimeException("Resource with id=" + resourceId + " was not found."));
		resource.setActive(false);
	}

}
