import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';


@Component({
  selector: 'app-manager-site-visit-view',
  templateUrl: './manager-site-visit-view.component.html',
  styleUrls: ['./manager-site-visit-view.component.css']
})
export class ManagerSiteVisitViewComponent implements OnInit {

  content: string;

  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.userService.getManagerSiteVisitView().subscribe(
      data => {
        this.content = data;
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );
  }

}
