package com.faith.app.repository;

import java.util.List;

import com.faith.app.model.CourseEnquiry;

public interface ManagerCourseEnquiryRepository {
	
	public List<CourseEnquiry> findAllSortedCourseEnquiry();

	public List<CourseEnquiry> findAllCourseEnquiry(Integer EnquiryStatus);
}
