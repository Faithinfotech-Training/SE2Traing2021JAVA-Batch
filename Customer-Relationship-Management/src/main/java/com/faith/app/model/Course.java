package com.faith.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String course_name;
    private String course_description;
    private String course_duration;
    private Long course_id;
    private float course_price;
    
    
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	public String getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(String course_duration) {
		this.course_duration = course_duration;
	}
	public Long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}
	public float getCourse_price() {
		return course_price;
	}
	public void setCourse_price(float course_price) {
		this.course_price = course_price;
	}
   
    
    
}
