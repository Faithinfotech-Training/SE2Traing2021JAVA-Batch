import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Course } from '../course';
import { CourseService } from '../course.service';

@Component({
  selector: 'app-update-course',
  templateUrl: './update-course.component.html',
  styleUrls: ['./update-course.component.css']
})
export class UpdateCourseComponent implements OnInit {

  course : Course =new Course();

  courseId: number;
  constructor(private courseService: CourseService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.courseId=this.route.snapshot.params['courseId'];
    this.courseService.getCourseById(this.courseId).subscribe(data=>{
      this.course=data;

    });
  }
  // updateResource(){
  //   this.resourceService.updateResource(this.resourceId, this.resource).subscribe(data=>{
  //     console.log(data);
  //     this.resource=new Resource();
  //     this.goToList();


  //   })
  // }

// onSubmit(){
//   this.updateResource();
// }


}
