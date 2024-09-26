	package com.faith.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="guest_data")
public class Guest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long guestId;
	private String guestName;
	private String guestEmail;
	private String guestPhoneNumber;
	private String dateOfBirth;
	private Long courseEnqId;
	private Long resourceEnqId;
	private float marks;
	private String qualification;
	private Boolean isActive;
	
	
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Guest(Long guestId, String guestName, String guestEmail, String guestPhoneNumber, String dateOfBirth,
			Long courseEnqId, Long resourceEnqId, float marks, String qualification, Boolean isActive) {
		super();
		this.guestId = guestId;
		this.guestName = guestName;
		this.guestEmail = guestEmail;
		this.guestPhoneNumber = guestPhoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.courseEnqId = courseEnqId;
		this.resourceEnqId = resourceEnqId;
		this.marks = marks;
		this.qualification = qualification;
		this.isActive = isActive;
	}


	public Long getGuestId() {
		return guestId;
	}


	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}


	public String getGuestName() {
		return guestName;
	}


	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}


	public String getGuestEmail() {
		return guestEmail;
	}


	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}


	public String getGuestPhoneNumber() {
		return guestPhoneNumber;
	}


	public void setGuestPhoneNumber(String guestPhoneNumber) {
		this.guestPhoneNumber = guestPhoneNumber;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Long getCourseEnqId() {
		return courseEnqId;
	}


	public void setCourseEnqId(Long courseEnqId) {
		this.courseEnqId = courseEnqId;
	}


	public Long getResourceEnqId() {
		return resourceEnqId;
	}


	public void setResourceEnqId(Long resourceEnqId) {
		this.resourceEnqId = resourceEnqId;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
	

}
