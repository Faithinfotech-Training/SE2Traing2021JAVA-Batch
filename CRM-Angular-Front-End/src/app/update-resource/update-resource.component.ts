import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Resource } from '../resource';
import { ResourceService } from '../resource.service';

@Component({
  selector: 'app-update-resource',
  templateUrl: './update-resource.component.html',
  styleUrls: ['./update-resource.component.css']
})
export class UpdateResourceComponent implements OnInit {

  resource : Resource =new Resource();

  resourceId: number;
  constructor(private resourceService: ResourceService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.resourceId=this.route.snapshot.params['resourceId'];
    this.resourceService.getResourceById(this.resourceId).subscribe(data=>{
      this.resource=data;

    },error => console.log(error));
  }
 
onSubmit(){
 this.resourceService.updateResource(this.resourceId, this.resource).subscribe(data=>{
  this.goToResourceList();
 });
}

goToResourceList(){
  this.router.navigate(['/resources']);

  
}


}
