import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';
import { ResourceEnquiry } from '../resource-enquiry';
import { ResourceEnquiryService } from '../resource-enquiry.service';
import { Router } from '@angular/router';



@Component({
  selector: 'app-manager-resource-enquiry-summary',
  templateUrl: './manager-resource-enquiry-summary.component.html',
  styleUrls: ['./manager-resource-enquiry-summary.component.css']
})
export class ManagerResourceEnquirySummaryComponent implements OnInit {

  resourceEnquiries: ResourceEnquiry[];
  resourceEnquiry: ResourceEnquiry = new ResourceEnquiry();

  constructor(private resourceEnquiryService: ResourceEnquiryService, private router: Router) { }

  ngOnInit(): void {
    this.getResourceEnquiries();
  }

  getResourceEnquiries() {
    this.resourceEnquiryService.getResourceEnquiryList().subscribe(data => {
      this.resourceEnquiries = data;
    });
  }


  // goToResourceList() {
  //   this.router.navigate(['/resources']);


  // }

  // onSubmit() {
  //   console.log(this.resource);
  //   this.saveResource();
  //   window.location.reload();
  // }
}
