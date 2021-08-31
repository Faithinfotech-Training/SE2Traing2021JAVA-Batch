package com.faith.app.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;

	@Column(nullable = false , length = 50)
	private String course_name;
	
	@Column(nullable = false)
    private String course_description;
	
	@Column(nullable = false , length = 50)
    private String course_duration;
	
	@Column(nullable = false , length = 50)
    private float course_price;
	
	@Column(nullable = false)
	private float min_percentage;
	
	@Column(nullable = false)
    private int ageCriteria;
	
	@Column(nullable = false)
    private boolean is_active;

    
	@ManyToOne
	@JoinColumn(name = "accessId")
	private Access access;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	@JoinTable(name = "qualification_course", joinColumns = {
			@JoinColumn(name = "course_id") }, inverseJoinColumns = { @JoinColumn(name = "qualification_id") })
	private Set<CourseQualification> qualifications = new HashSet<>();
    
	public Course() {
		super();
	}
	
	public Course(Long courseId, String course_name, String course_description, String course_duration,
			float course_price, float min_percentage, int ageCriteria, boolean is_active, Access access,
			Set<CourseQualification> qualifications) {
		super();
		this.courseId = courseId;
		this.course_name = course_name;
		this.course_description = course_description;
		this.course_duration = course_duration;
		this.course_price = course_price;
		this.min_percentage = min_percentage;
		this.ageCriteria = ageCriteria;
		this.is_active = is_active;
		this.access = access;
		this.qualifications = qualifications;
	}
	
	public float getMin_percentage() {
		return min_percentage;
	}
	public void setMin_percentage(float min_percentage) {
		this.min_percentage = min_percentage;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public int getAgeCriteria() {
		return ageCriteria;
	}

	public void setAgeCriteria(int ageCriteria) {
		this.ageCriteria = ageCriteria;
	}

	public Access getAccess() {
		return access;
	}

	public void setAccess(Access access) {
		this.access = access;
	}

	public Set<CourseQualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(Set<CourseQualification> qualifications) {
		this.qualifications = qualifications;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

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
		return courseId;
	}
	public void setCourse_id(Long course_id) {
		this.courseId = course_id;
	}
	public float getCourse_price() {
		return course_price;
	}
	public void setCourse_price(float course_price) {
		this.course_price = course_price;
	}
    
}
