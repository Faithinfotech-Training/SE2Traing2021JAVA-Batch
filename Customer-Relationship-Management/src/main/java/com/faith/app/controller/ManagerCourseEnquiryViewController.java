package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.CourseEnquiry;
import com.faith.app.service.ManagerCourseEnquiryService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/enquiry")
public class ManagerCourseEnquiryViewController {

	@Autowired
	private ManagerCourseEnquiryService managerCourseEnquiryService;

	// Get a list of courses sorted on the basis of date.
	@GetMapping("/course/priority")
	public ResponseEntity findAllResourceEnquiry() {
		List<CourseEnquiry> listOfCourseEnquiries = managerCourseEnquiryService.findAllSortedCourseEnquiry();
		if (listOfCourseEnquiries == null)
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(listOfCourseEnquiries);
	}

	// return list of enquiries of parameterised type
	@GetMapping("/course/status/{id}")
	public ResponseEntity findAllCourseEnquiry(@PathVariable("id") Integer EnquiryStatus) {
		List<CourseEnquiry> listOfCourseEnquiries = managerCourseEnquiryService.findAllCourseEnquiry(EnquiryStatus);
		if (listOfCourseEnquiries == null)
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(listOfCourseEnquiries);
	}

}
