package com.faith.app.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.CourseEnquiry;
import com.faith.app.repository.ManagerCourseEnquiryRepository;
import com.faith.app.repository.ManagerCourseEnquiryRepositoryImpl;

@Service
public class ManagerCourseEnquiryService {

	private ManagerCourseEnquiryRepository manageCourseEnquiryRepository;

	@Autowired
	public ManagerCourseEnquiryService(ManagerCourseEnquiryRepositoryImpl manageCourseEnquiryRepository) {
		super();
		this.manageCourseEnquiryRepository = manageCourseEnquiryRepository;
	}

	
	@Transactional
	public List<CourseEnquiry> findAllSortedCourseEnquiry() {
		return manageCourseEnquiryRepository.findAllSortedCourseEnquiry();
	}

	
	@Transactional
	public List<CourseEnquiry> findAllCourseEnquiry(Integer CourseEnquiryStatus) {
		return manageCourseEnquiryRepository.findAllCourseEnquiry(CourseEnquiryStatus);
	}

}
