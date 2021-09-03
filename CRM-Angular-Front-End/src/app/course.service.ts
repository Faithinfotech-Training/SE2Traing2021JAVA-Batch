import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Course } from './course';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  private baseUrl = 'http://localhost:8080/api/courses'

  constructor(private httpClient: HttpClient) { }

  getCourseList():Observable<Course[]> {
    return this.httpClient.get<Course[]>(`${this.baseUrl}`);
  }
  createCourse(course: Course): Observable<Object>{
    return this.httpClient.post(`${this.baseUrl}`,course);
  }

  getCourseById(courseId:number): Observable<Course>{
    return this.httpClient.get<Course>(`${this.baseUrl}/${courseId}`);
 
  }

  updateCourse(courseId:number, course:Course):Observable<object>{
    return this.httpClient.put<object>(`${this.baseUrl}/${courseId}`,course);
  }

}
