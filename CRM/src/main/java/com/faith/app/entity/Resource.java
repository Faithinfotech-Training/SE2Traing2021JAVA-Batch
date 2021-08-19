package com.faith.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resource_New_management")
public class Resource {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long resource_id;
	private String resource_name;
	private String resource_description;
	private String resource_type;
	private float price;
	public Long getResource_id() {
		return resource_id;
	}
	public void setResource_id(Long resource_id) {
		this.resource_id = resource_id;
	}
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
	/*
	 * @Override public String toString() { return "Resource [resource_id=" +
	 * resource_id + ", resource_name=" + resource_name + ", resource_description="
	 * + resource_description + ", resource_type=" + resource_type + ", price=" +
	 * price + "]"; }
	 */
	
	

}
