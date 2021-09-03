import { Component, OnInit } from '@angular/core';
import{ Course } from '../course';
import { CourseService } from '../course.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-course-display',
  templateUrl: './course-display.component.html',
  styleUrls: ['./course-display.component.css']
})
export class CourseDisplayComponent implements OnInit {

  courses: Course[];
 

  constructor(private courseService: CourseService, private router: Router) { }

  ngOnInit(): void {
    this.getCourses();
  }
  getCourses(){
    this.courseService.getCoursesList().subscribe(data => {
     this.courses=data;
   });
 }

}
