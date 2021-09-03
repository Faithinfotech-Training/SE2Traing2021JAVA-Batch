import { Component, OnInit } from '@angular/core';
import{ Course } from '../course';
import { CourseService} from '../course.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html',
  styleUrls: ['./course-list.component.css']
})
export class CourseListComponent implements OnInit {

  courses: Course[];
  course: Course=new Course();

  constructor(private courseService: CourseService,private router: Router) { }

  ngOnInit(): void {
    this.getCourses();
  }

  getCourses(){
     this.courseService.getCoursesList().subscribe(data => {
      this.courses=data;
    });
  }


  saveCourse(){
 
    this.courseService.createCourse(this.course).subscribe(data => {
      console.log(data);
      this.goToCourseList();
    },
    error=>console.log(error));
  }
  
  goToCourseList(){
    this.router.navigate(['/courses']);

    
  }
  
    onSubmit(){
    console.log(this.course);
      this.saveCourse();
      window.location.reload();
    }
  

}
