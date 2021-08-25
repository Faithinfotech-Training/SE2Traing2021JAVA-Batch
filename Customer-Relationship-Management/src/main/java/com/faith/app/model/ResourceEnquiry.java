package com.faith.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resource_enquiry")
public class ResourceEnquiry {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long resourceEnquiryId;
	
	@Column(name="Guest_Id")
	private Long guestId;
	
	@Column(name="Resource_ID")
	private Long resourceId;
	
	@Column(name="Date")
	private String date;
	
	@Column(name="Enquiry_Status")
	private String enquiryStatus;
	
	
	
	

	public ResourceEnquiry() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public ResourceEnquiry(Long resourceEnquiryId, Long guestId, Long resourceId, String date,
			String enquiryStatus) {
		super();
		this.resourceEnquiryId = resourceEnquiryId;
		this.guestId = guestId;
		this.resourceId = resourceId;
		this.date = date;
		this.enquiryStatus = enquiryStatus;
	}



	public Long getResourceEnquiryId() {
		return resourceEnquiryId;
	}

	public void setResourceEnquiryId(Long resourceEnquiryId) {
		this.resourceEnquiryId = resourceEnquiryId;
	}

	public Long getGuestId() {
		return guestId;
	}

	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEnquiryStatus() {
		return enquiryStatus;
	}

	public void setEnquiryStatus(String enquiryStatus) {
		this.enquiryStatus = enquiryStatus;
	}
	
	
	
	
	
	
	

}
