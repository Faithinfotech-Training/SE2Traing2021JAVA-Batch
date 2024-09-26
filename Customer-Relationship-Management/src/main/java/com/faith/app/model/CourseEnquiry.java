package com.faith.app.model;

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
@Table(name="course_enquiry")

public class CourseEnquiry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long courseEnquiryId;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=Guest.class)
	@JoinColumn(name="guest_id")
	private Guest guestId;
	
	@ManyToOne(cascade=CascadeType.MERGE, targetEntity=Course.class)
	@JoinColumn(name="course_id")
	private Course courseId;
	
	@Column(name="date")
	private String enquiryDate;
	
	@ManyToOne(cascade=CascadeType.REFRESH, targetEntity=CourseEnquiryStatus.class)
	@JoinColumn(name="status_id")
	private CourseEnquiryStatus enquiryStatus;
	
	@Column(name="Is_Active_Bit")
	private boolean isActive;


	public CourseEnquiry() {
		super();
	}
	
	
	public CourseEnquiry(Long courseEnquiryId, Guest guestId, Course courseId, String date, CourseEnquiryStatus enquiryStatus) {
		super();
		this.courseEnquiryId = courseEnquiryId;
		this.guestId = guestId;
		this.courseId = courseId;
		this.enquiryDate = date;
		this.enquiryStatus = enquiryStatus;
	}


	public Long getCourseEnquiryId() {
		return courseEnquiryId;
	}


	public void setCourseEnquiryId(Long courseEnquiryId) {
		this.courseEnquiryId = courseEnquiryId;
	}


	public Guest getGuestId() {
		return guestId;
	}


	public void setGuestId(Guest guestId) {
		this.guestId = guestId;
	}


	public Course getCourseId() {
		return courseId;
	}


	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}


	public String getDate() {
		return enquiryDate;
	}


	public void setDate(String date) {
		this.enquiryDate = date;
	}


	public CourseEnquiryStatus getEnquiryStatus() {
		return enquiryStatus;
	}


	public void setEnquiryStatus(CourseEnquiryStatus enquiryStatus) {
		this.enquiryStatus = enquiryStatus;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
