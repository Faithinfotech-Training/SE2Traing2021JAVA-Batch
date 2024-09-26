import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';
import { CourseEnquiry } from '../course-enquiry';
import { CourseEnquiryService } from '../course-enquiry.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-manager-course-enquiry-summary',
  templateUrl: './manager-course-enquiry-summary.component.html',
  styleUrls: ['./manager-course-enquiry-summary.component.css']
})
export class ManagerCourseEnquirySummaryComponent implements OnInit {

  courseEnquiries: CourseEnquiry[];
  courseEnquiry: CourseEnquiry = new CourseEnquiry();

  constructor(private courseEnquiryService: CourseEnquiryService, private router: Router) { }

  ngOnInit(): void {
    this.getCourseEnquiries();
  }

  getCourseEnquiries() {
      this.courseEnquiryService.getCourseEnquiryList().subscribe(data => {
      this.courseEnquiries = data;
    });
  }

}
