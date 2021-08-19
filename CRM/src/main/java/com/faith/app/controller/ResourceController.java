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

import com.faith.app.dao.ResourceRepository;
import com.faith.app.dto.ResourceModel;

import com.faith.app.entity.Resource;

import com.faith.app.service.ResourceService;

@RestController
public class ResourceController {
	
	private ResourceService resourceService;
	private ResourceRepository resourceRepository;

	@Autowired
	public ResourceController(ResourceService resourceService,ResourceRepository resourceRepository) {
		super();
		this.resourceService = resourceService;
		this.resourceRepository=resourceRepository;
	}
	
		//Create New Resource
	 	@PostMapping("/api/resource/create")
	    public ResponseEntity<Object> createResource(@RequestBody Resource resource) {
	    	
	    	return resourceService.createResource(resource);
	    }
	    
	    //get all resources
	    @GetMapping("/api/resource/all")
	    public List<ResourceModel> getResources(){
	    	return resourceService.getResources();
	    }
	    
	    @GetMapping("/api/resource/details/{id}")
	    public ResourceModel getResource(@PathVariable Long resource_id) {
	        return resourceService.getResource(resource_id);
	    }
	    
	    @PutMapping("/api/resource/update/{id}")
	    public ResponseEntity<Object> updateResource(@PathVariable Long resource_id, @RequestBody Resource resource) {
	        return resourceService.updateResource(resource, resource_id);
	    }
	    
	

}
