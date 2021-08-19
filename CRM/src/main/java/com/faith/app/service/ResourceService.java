package com.faith.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faith.app.dao.ResourceRepository;
import com.faith.app.dto.ResourceModel;

import com.faith.app.entity.Resource;




@Service
public class ResourceService {
	
	
	private ResourceRepository resourceRepository;

	public ResourceService(ResourceRepository resourceRepository) {
		super();
		this.resourceRepository = resourceRepository;
	}
	
	
	//Creating New Resource
	
	public ResponseEntity<Object> createResource(Resource model) {
		
		Resource resource = new Resource();
		
		resource.setResource_name(model.getResource_name());
		resource.setResource_description(model.getResource_description());
        resource.setResource_type(model.getResource_type());
        resource.setPrice(model.getPrice());
       
		
        //save the record
        Resource savedResources= resourceRepository.save(resource);
		
        if (resourceRepository.findById(savedResources.getResource_id()).isPresent()) 
        	return ResponseEntity.ok("Resource Created Successfully");
        else
        	return ResponseEntity.unprocessableEntity().body("Failed Creating Resource");
        
		
	}
	
	
	
	
	
	//get all Resources
		public List<ResourceModel > getResources(){
		
			List <Resource> resourceList=(List<Resource>) resourceRepository.findAll();
			 if(resourceList.size()>0) {
				 
				 List<ResourceModel> resourceModels = new ArrayList<>();
				 
				 for (Resource resource : resourceList) {
					  ResourceModel model = new ResourceModel();
					 
					 model.setResource_name(resource.getResource_name());
		             model.setResource_description(resource.getResource_description());
		             model.setResource_type(resource.getResource_type());
		             model.setPrice(resource.getPrice());
		             
		             resourceModels.add(model);
				 }
				 return resourceModels;
			 }
			 else return new ArrayList<ResourceModel>();
			
		}
		
		
		
		
		
		// Get the resource by ID
		 public ResourceModel getResource(Long resource_id) {
		        if(resourceRepository.findById(resource_id).isPresent()) {
		            Resource resource = resourceRepository.findById(resource_id).get();
		            ResourceModel resourceModel = new ResourceModel();
		            resourceModel.setResource_name(resource.getResource_name());
		            resourceModel.setResource_description(resource.getResource_description());
		            resourceModel.setResource_type(resource.getResource_type());
		            resourceModel.setPrice(resource.getPrice());
		            
		            return resourceModel;
		        } else return null;
		    }
		 
		 
		 
		 
		 
		 /** Update an Existing Resource */
		    @Transactional
		    public ResponseEntity<Object> updateResource(Resource resource, Long resource_id) {
		        if(resourceRepository.findById(resource_id).isPresent()) {
		            Resource newResource = resourceRepository.findById(resource_id).get();
		            newResource.setResource_name(resource.getResource_name());
		            newResource.setResource_description(resource.getResource_description());
		            newResource.setResource_type(resource.getResource_type());
		            newResource.setPrice(resource.getPrice());
		            
		            Resource savedResource = resourceRepository.save(newResource);
		            if(resourceRepository.findById(savedResource.getResource_id()).isPresent())
		                return  ResponseEntity.accepted().body("Resource updated successfully");
		            else return ResponseEntity.unprocessableEntity().body("Failed updating the Resource specified");
		        } else return ResponseEntity.unprocessableEntity().body("Cannot find the Resource specified");
		    }
		
		
}
