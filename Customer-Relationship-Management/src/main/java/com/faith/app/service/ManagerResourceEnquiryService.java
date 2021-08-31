package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.exception.ResourceNotFoundException;
import com.faith.app.model.ResourceEnquiry;
import com.faith.app.repository.ResourceEnquiryRepository;

@Service
public class ManagerResourceEnquiryService {
	
	private final ResourceEnquiryRepository resourceEnquiryRepository;
	
	@Autowired
	public ManagerResourceEnquiryService(ResourceEnquiryRepository resourceEnquiryRepository) {
		this.resourceEnquiryRepository = resourceEnquiryRepository;
	}
	
	//Get ResourceEnquiry by Id
	public ResourceEnquiry getResourceEnquiry(long resourceEnquiryId) {
		return resourceEnquiryRepository.findById(resourceEnquiryId).orElseThrow(()->new ResourceNotFoundException("Entered ID is not present"));
	}
	
	//List all resource enquiries
	public List<ResourceEnquiry> listAllResourceEnquiries(){
		return resourceEnquiryRepository.findAll();
	}
	
	//Add new ResourceEnquiry
	public ResourceEnquiry addResourceEnquiry(ResourceEnquiry resourceEnquiry) {
		return resourceEnquiryRepository.save(resourceEnquiry);
	}
	
	public ResourceEnquiry updateResourceEnquiry(Long enquiryId, ResourceEnquiry resourceEnquiry) {
		ResourceEnquiry enquiry=resourceEnquiryRepository.findById(enquiryId).orElseThrow(()->new ResourceNotFoundException("Entered ID is not present"));
		  enquiry.setResourceId(resourceEnquiry.getResourceId());
		  enquiry.setDate(resourceEnquiry.getDate());
		  enquiry.setGuestId(resourceEnquiry.getGuestId());
		  enquiry.setEnquiryStatus(resourceEnquiry.getEnquiryStatus());
		  enquiry.setActive(resourceEnquiry.isActive());
		  
		  ResourceEnquiry enquiryUpdate=resourceEnquiryRepository.save(enquiry);
		  return enquiryUpdate;
	}
	
	public void deleteResourceEnquiry(ResourceEnquiry resourceEnquiry) {
		resourceEnquiry.setActive(false);
	}

	public ResourceEnquiry updateResourceEnquiryStatus(long enquiryId, ResourceEnquiry enquiryDetails) {
		  
		ResourceEnquiry enquiry=resourceEnquiryRepository.findById(enquiryId).orElseThrow(()->new ResourceNotFoundException("Entered ID is not present"));
		enquiry.setEnquiryStatus(enquiryDetails.getEnquiryStatus());
		ResourceEnquiry enquiryUpdate=resourceEnquiryRepository.save(enquiry);
		return enquiryUpdate;
	}
}
