package com.faith.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResourceEnquiryStatus {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer statusId;
	
	@Column(nullable=false,length=50)
	private String statusType;

	public ResourceEnquiryStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceEnquiryStatus(Integer statusId, String statusType) {
		super();
		this.statusId = statusId;
		this.statusType = statusType;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusType() {
		return statusType;
	}

	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}

	@Override
	public String toString() {
		return "ResourceEnquiryStatus [statusId=" + statusId + ", statusType=" + statusType + "]";
	}
	
	
	
}
