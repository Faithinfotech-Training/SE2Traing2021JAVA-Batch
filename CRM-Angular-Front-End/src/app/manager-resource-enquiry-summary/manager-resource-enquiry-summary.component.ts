import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';


@Component({
  selector: 'app-manager-resource-enquiry-summary',
  templateUrl: './manager-resource-enquiry-summary.component.html',
  styleUrls: ['./manager-resource-enquiry-summary.component.css']
})
export class ManagerResourceEnquirySummaryComponent implements OnInit {

  content: string;

  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.userService.getManagerResourceEnquirySummary().subscribe(
      data => {
        this.content = data;
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );
  }
}
