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
	private String courseName;
	
	@Column(nullable = false)
    private String courseDescription;
	
	@Column(nullable = false , length = 50)
    private String courseDuration;
	
	@Column(nullable = false , length = 50)
    private float coursePrice;
	
	@Column(nullable = false)
	private float minPercentage;
	
	@Column(nullable = false)
    private int ageCriteria;
	
	@Column(nullable = false)
    private boolean isActive;

	@ManyToOne
	@JoinColumn(name = "accessId")
	private Access access;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	@JoinTable(name = "qualification_course", joinColumns = {
			@JoinColumn(name = "course_id") }, inverseJoinColumns = { @JoinColumn(name = "qualification_id") })
	private Set<Qualification> qualifications = new HashSet<>();
    
	public Course() {
		super();
	}
	
	public Course(Long courseId, String courseName, String courseDescription, String courseDuration,
			float coursePrice, float minPercentage, int ageCriteria, boolean isActive, Access access,
			Set<Qualification> qualifications) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseDuration = courseDuration;
		this.coursePrice = coursePrice;
		this.minPercentage = minPercentage;
		this.ageCriteria = ageCriteria;
		this.isActive = isActive;
		this.access = access;
		this.qualifications = qualifications;
	}

	
	
	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public float getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(float coursePrice) {
		this.coursePrice = coursePrice;
	}

	public float getMinPercentage() {
		return minPercentage;
	}

	public void setMinPercentage(float minPercentage) {
		this.minPercentage = minPercentage;
	}

	public int getAgeCriteria() {
		return ageCriteria;
	}

	public void setAgeCriteria(int ageCriteria) {
		this.ageCriteria = ageCriteria;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Access getAccess() {
		return access;
	}

	public void setAccess(Access access) {
		this.access = access;
	}

	public Set<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(Set<Qualification> qualifications) {
		this.qualifications = qualifications;
	}
	
	
}
