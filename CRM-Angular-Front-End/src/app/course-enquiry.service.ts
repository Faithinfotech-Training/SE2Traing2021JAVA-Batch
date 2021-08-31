import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CourseEnquiry } from './course-enquiry';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CourseEnquiryService {

  private baseUrl = 'http://localhost:8080/api/course/enquiries'

  constructor(private httpClient: HttpClient) { }

  getCourseEnquiryList():Observable<CourseEnquiry[]> {
    return this.httpClient.get<CourseEnquiry[]>(`${this.baseUrl}`);
  }
}
