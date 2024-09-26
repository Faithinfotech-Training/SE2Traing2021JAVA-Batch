import { Component, OnInit } from '@angular/core';
import{Resource} from '../resource';
import {ResourceService} from '../resource.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-resource-display',
  templateUrl: './resource-display.component.html',
  styleUrls: ['./resource-display.component.css']
})
export class ResourceDisplayComponent implements OnInit {

  resources: Resource[];
 

  constructor(private resourceService: ResourceService,private router: Router) { }

  ngOnInit(): void {
    this.getResources();
  }
  getResources(){
    this.resourceService.getResourcesList().subscribe(data => {
     this.resources=data;
   });
 }

}
