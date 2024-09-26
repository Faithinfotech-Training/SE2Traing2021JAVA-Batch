package com.faith.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batch")
public class Batch {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long batchId;
	private Long resourceId;
	private Long courseId;
	private String batchName;
	private String batchInfo;
	private int batchCapacity;
	private String startDate;
	private String endDate;
	private Boolean isActive;
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batch(Long resourceId, Long courseId, String batchName, String batchInfo, int batchCapacity,
			String startDate, String endDate, Boolean isActive) {
		super();
		this.resourceId = resourceId;
		this.courseId = courseId;
		this.batchName = batchName;
		this.batchInfo = batchInfo;
		this.batchCapacity = batchCapacity;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isActive = isActive;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchInfo() {
		return batchInfo;
	}

	public void setBatchInfo(String batchInfo) {
		this.batchInfo = batchInfo;
	}

	public int getBatchCapacity() {
		return batchCapacity;
	}

	public void setBatchCapacity(int batchCapacity) {
		this.batchCapacity = batchCapacity;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
	

}
