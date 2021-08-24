package com.faith.app.model;

import java.util.List;

public class CourseModel {

	
	private String course_name;
	private Long course_id;
	private String course_description;
	private String course_duration;
	private float course_price;
	
	private List<CourseModel> courses;

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
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

	public float getCourse_price() {
		return course_price;
	}

	public void setCourse_price(float course_price) {
		this.course_price = course_price;
	}

	public List<CourseModel> getCourses() {
		return courses;
	}

	public void setCourses(List<CourseModel> courses) {
		this.courses = courses;
	}
	
	
}
