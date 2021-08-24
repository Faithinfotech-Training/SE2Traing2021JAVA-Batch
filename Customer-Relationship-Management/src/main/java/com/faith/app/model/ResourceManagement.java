package com.faith.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resource_management")
public class ResourceManagement {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long resourceId;
	
	@Column(name="Resource_Name")
	private String resourceName;
	
	@Column(name="Resource_Type")
	private String resourceType;
	
	@Column(name="Max_Capacity")
	private int maxCapacity;
	
	@Column(name="Avaliable_Capacity")
	private int avaliableCapacity;
	
	@Column(name="Is_Active_Bit")
	private boolean isActive;
	
	
	
	
	
	public ResourceManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ResourceManagement(long resourceId, String resourceName, String resourceType, int maxCapacity,
			int avaliableCapacity, boolean isActive) {
		super();
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.resourceType = resourceType;
		this.maxCapacity = maxCapacity;
		this.avaliableCapacity = avaliableCapacity;
		this.isActive = isActive;
	}
	public long getResourceId() {
		return resourceId;
	}
	public void setResourceId(long resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public int getAvaliableCapacity() {
		return avaliableCapacity;
	}
	public void setAvaliableCapacity(int avaliableCapacity) {
		this.avaliableCapacity = avaliableCapacity;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	

}
