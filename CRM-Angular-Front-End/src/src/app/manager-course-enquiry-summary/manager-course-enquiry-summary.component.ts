import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';


@Component({
  selector: 'app-manager-course-enquiry-summary',
  templateUrl: './manager-course-enquiry-summary.component.html',
  styleUrls: ['./manager-course-enquiry-summary.component.css']
})
export class ManagerCourseEnquirySummaryComponent implements OnInit {

  content: string;

  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.userService.getManagerCourseEnquirySummary().subscribe(
      data => {
        this.content = data;
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );
  }

}
