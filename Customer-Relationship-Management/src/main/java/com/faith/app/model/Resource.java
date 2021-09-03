package com.faith.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="resource")
public class Resource {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long resourceId;
	
	@Column(name="Resource_Name")
	private String resourceName;
	
	@ManyToOne
	@JoinColumn(name="resourceTypeId")
	private ResourceType resourceType;
	
	@ManyToOne
	@JoinColumn(name="accessId")
	private Access access;
	
	@Column(name="Max_Capacity")
	private int maxCapacity;
	
	@Column(name="Avaliable_Capacity")
	private int avaliableCapacity;
	
	@Column(name="Resource_Description")
	private String resourceDescription;
	
	@Column(name="Is_Active_Bit")
	private boolean isActive;
	
	public Resource() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Resource(long resourceId, String resourceName, ResourceType resourceType, Access access, int maxCapacity,
			int avaliableCapacity, String resourceDescription, boolean isActive) {
		super();
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.resourceType = resourceType;
		this.access = access;
		this.maxCapacity = maxCapacity;
		this.avaliableCapacity = avaliableCapacity;
		this.resourceDescription = resourceDescription;
		this.isActive = isActive;
	}
	public long getResourceId() {
		return resourceId;
	}
	public void setResourceId(long resourceId) {
		this.resourceId = resourceId;
	}
	public Access getAccess() {
		return access;
	}
	public void setAccess(Access access) {
		this.access = access;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public ResourceType getResourceType() {
		return resourceType;
	}
	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public String getResourceDescription() {
		return resourceDescription;
	}
	public void setResourceDescription(String resourceDescription) {
		this.resourceDescription = resourceDescription;
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
