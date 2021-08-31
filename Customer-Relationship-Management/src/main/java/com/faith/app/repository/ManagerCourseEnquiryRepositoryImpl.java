package com.faith.app.repository;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.faith.app.model.CourseEnquiry;

@Repository
public class ManagerCourseEnquiryRepositoryImpl implements ManagerCourseEnquiryRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	public ManagerCourseEnquiryRepositoryImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<CourseEnquiry> findAllSortedCourseEnquiry() {
		Query query = entityManager.createQuery("from course_enquiry order by enquirydate");
		List<CourseEnquiry> courseEnquiries = query.getResultList();
		return courseEnquiries;

	}

	@Override
	public List<CourseEnquiry> findAllCourseEnquiry(Integer CourseEnquiryStatus) {
		System.out.println(CourseEnquiryStatus.toString());
		Query query = entityManager.createQuery("from course_enquiry where status_id = " + CourseEnquiryStatus.toString());
		List<CourseEnquiry> courseEnquiries = query.getResultList();
		return courseEnquiries;
	}



}
