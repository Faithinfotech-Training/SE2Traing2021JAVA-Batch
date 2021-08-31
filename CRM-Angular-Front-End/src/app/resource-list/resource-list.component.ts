import { Component, OnInit } from '@angular/core';
import{Resource} from '../resource';
import {ResourceService} from '../resource.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-resource-list',
  templateUrl: './resource-list.component.html',
  styleUrls: ['./resource-list.component.css']
})
export class ResourceListComponent implements OnInit {

  data:any;
  resources: Resource[];
  resource:Resource=new Resource();


  constructor(private resourceService: ResourceService,private router: Router) { }

  ngOnInit(): void {
    this.getResources();
  }

  getResources(){
     this.resourceService.getResourcesList().subscribe(data => {
      this.resources=data;
    });
  }


  saveResource(){
 
    this.resourceService.createResource(this.resource).subscribe(data => {
      console.log(data);
      this.goToResourceList();
    },
    error=>console.log(error));
  }
  
  goToResourceList(){
    this.router.navigate(['/resources']);

    
  }
  
updateResource(id:number){
  this.router.navigate(['update-resource',id]);
  

}

    onSubmit(){
    console.log(this.resource);
      this.saveResource();
      window.location.reload();
    }
  

}
