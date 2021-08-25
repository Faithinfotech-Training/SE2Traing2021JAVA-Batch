package com.faith.app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test/")
public class ViewController {
	
	//Manager site visit tabular and chart view
	@GetMapping("manager/site-visit-view")
	@PreAuthorize("hasRole('MANAGER')")
	public String managerSiteVisitView() {
		return "Site Visit Data.";
	}
	
	//Manager Summary View of Course Enquiry and Drill down view from summary
	@GetMapping("manager/course-enquiries-view")
	@PreAuthorize("hasRole('MANAGER')")
	public String managerCourseEnquiriesView() {
		return "Course Enquiries";
	}
	
	//Manager Summary View of Resource and Drill down view from summary
	@GetMapping("manager/resource-enquiries-view")
	@PreAuthorize("hasRole('MANAGER')")
	public String managerResourceEnquiriesView() {
		return "Resource Enquiries";
	}
}
