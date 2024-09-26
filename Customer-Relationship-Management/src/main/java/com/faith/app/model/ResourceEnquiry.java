package com.faith.app.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="resource_enquiry")
public class ResourceEnquiry {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long resourceEnquiryId;

//	old
//	@Column(name="Guest_Id")
//	private long guestId;
//	
//	@Column(name="Resource_ID")
//	private long resourceId;
//	old	
// 	similar for CourseEnquiry
	
//	@Column(name="Enquiry_Status")
//	private String enquiryStatus;
	
	
//	new	
	@ManyToOne(cascade=CascadeType.MERGE, targetEntity=Guest.class)
	@JoinColumn(name = "guestId")
	private Guest guestId;
	
	@ManyToOne(cascade=CascadeType.MERGE, targetEntity=Resource.class)
	@JoinColumn(name="resourceId")
	private Resource resourceId;
	
	@Column(name="Date")
	private LocalDate date;
	
	@ManyToOne(cascade=CascadeType.REFRESH, targetEntity=ResourceEnquiryStatus.class)
	@JoinColumn(name="status_id")
	private ResourceEnquiryStatus enquiryStatus;
	
	@Column(name="Is_Active_Bit")
	private boolean isActive;


	public ResourceEnquiry() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ResourceEnquiry(Long resourceEnquiryId, Guest guestId, Resource resourceId, LocalDate date, ResourceEnquiryStatus enquiryStatus, boolean isActive) {
		super();
		this.resourceEnquiryId = resourceEnquiryId;
		this.guestId = guestId;
		this.resourceId = resourceId;
		this.date = LocalDate.now();
		this.enquiryStatus = enquiryStatus;
		this.isActive = isActive;
	}

	public Long getResourceEnquiryId() {
		return resourceEnquiryId;
	}

	public void setResourceEnquiryId(Long resourceEnquiryId) {
		this.resourceEnquiryId = resourceEnquiryId;
	}

	public Guest getGuestId() {
		return guestId;
	}

	public void setGuestId(Guest guestId) {
		this.guestId = guestId;
	}

	public Resource getResourceId() {
		return resourceId;
	}

	public void setResourceId(Resource resourceId) {
		this.resourceId = resourceId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

//	new	
	public ResourceEnquiryStatus getEnquiryStatus() {
		return enquiryStatus;
	}

	public void setEnquiryStatus(ResourceEnquiryStatus enquiryStatus) {
		this.enquiryStatus = enquiryStatus;
	}
	
//	old	
//	public String getEnquiryStatus() {
//		return enquiryStatus;
//	}
//
//	public void setEnquiryStatus(String enquiryStatus) {
//		this.enquiryStatus = enquiryStatus;
//	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

}
