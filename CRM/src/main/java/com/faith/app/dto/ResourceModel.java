package com.faith.app.dto;

public class ResourceModel {
	
	
	private String resource_name;
	private String resource_description;
	private String resource_type;
	private float price;
	
	public String getResource_name() {
		return resource_name;
	}
	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}
	public String getResource_description() {
		return resource_description;
	}
	public void setResource_description(String resource_description) {
		this.resource_description = resource_description;
	}
	public String getResource_type() {
		return resource_type;
	}
	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
