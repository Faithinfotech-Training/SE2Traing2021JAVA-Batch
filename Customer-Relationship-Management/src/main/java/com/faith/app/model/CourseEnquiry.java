package com.faith.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_enquiry")

public class CourseEnquiry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long courseEnquiryId;
	
	@Column(name="Guest_ID")
	private Long guestId;
	
	@Column(name="Course_ID")
	private Long courseId;
	
	@Column(name="Date")
	private String date;
	
	@Column(name="Enquiry_Status")
	private String enquiryStatus;
	
	@Column(name="Is_Active_Bit")
	private boolean isActive;


	public CourseEnquiry() {
		super();
	}
	
	
	public CourseEnquiry(Long courseEnquiryId, Long guestId, Long courseId, String date, String enquiryStatus) {
		super();
		this.courseEnquiryId = courseEnquiryId;
		this.guestId = guestId;
		this.courseId = courseId;
		this.date = date;
		this.enquiryStatus = enquiryStatus;
	}


	public Long getCourseEnquiryId() {
		return courseEnquiryId;
	}


	public void setCourseEnquiryId(Long courseEnquiryId) {
		this.courseEnquiryId = courseEnquiryId;
	}


	public Long getGuestId() {
		return guestId;
	}


	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}


	public Long getCourseId() {
		return courseId;
	}


	public void setCourseId(Long courseId) {
		this.courseId = courseId;
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
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
