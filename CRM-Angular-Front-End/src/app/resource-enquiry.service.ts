import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ResourceEnquiry } from './resource-enquiry';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ResourceEnquiryService {

  private baseUrl = 'http://localhost:8080/api/resource/enquiries'

  constructor(private httpClient: HttpClient) { }

  getResourceEnquiryList():Observable<ResourceEnquiry[]> {
    return this.httpClient.get<ResourceEnquiry[]>(`${this.baseUrl}`);
  }
}
