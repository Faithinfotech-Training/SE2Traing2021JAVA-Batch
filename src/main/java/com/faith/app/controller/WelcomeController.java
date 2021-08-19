package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.AuthRequest;
import com.faith.app.entity.CourseEnquiry;
import com.faith.app.entity.ResourceEnquiry;
import com.faith.app.service.CRMService;
import com.faith.app.util.JwtUtil;

@RestController
public class WelcomeController {

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to CRM application !!";
    }

  //gets the webpage that has the login form
    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        return jwtUtil.generateToken(authRequest.getUserName());
    }
    
    
	//2. Manager Site visit tabular and chart view

	@RequestMapping("/api/managers/view")
	public String ManagerView() {
		return "MangerView";
	}
	
	
	//3. Manager Summary View of Course Enquiry and Drill down view from summary

	@GetMapping("/api/managers/course-enquiries")
	public List<CourseEnquiry> ManagerCourseView() {
		return CRMService.findAllCourses();
	}
	
	//4. Manager Summary View of Resource and Drill down view from summary

	@GetMapping("/api/managers/resource-enquiries")
	public List<ResourceEnquiry> ManagerResourceView() {
		return CRMService.findAllResources();
	}
    
    
//    //V2
//	//2. Manager Site visit tabular and chart view
//
//	@RequestMapping("/api/managers/view")
//	public String ManagerView() {
//		return "MangerView";
//	}
//	
//	
//	//3. Manager Summary View of Course Enquiry and Drill down view from summary
//
//	@RequestMapping("/api/managers/course-enquiries")
//	public String ManagerCourseView() {
//		return "ManagerCourseView";
//	}
//	
//	//4. Manager Summary View of Resource and Drill down view from summary
//
//	@RequestMapping("/api/managers/resource-enquiries")
//	public String ManagerResourceView() {
//		return "ManagerResourceView";
//	}
	
	
	//Original
//	//1. Login Login as Admin / Manager using userName and Password and see the respective landing page: 
//
//	@GetMapping("/api/session/new")
//	//gets the webpage that has the login form
//	
//	@PostMapping("/api/session")
//	//authenticates credentials against database
//	
//	@DeleteMapping("/api/session")
//	//destroys session and redirects to /

    
}
