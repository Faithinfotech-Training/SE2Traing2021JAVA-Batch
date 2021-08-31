import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Resource } from './resource';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ResourceService {

  private baseUrl = 'http://localhost:8080/api/resource'

  constructor(private httpClient: HttpClient) { }

  getResourcesList():Observable<Resource[]> {
    return this.httpClient.get<Resource[]>(`${this.baseUrl}`);
  }
  createResource(resource: Resource): Observable<Object>{
    return this.httpClient.post(`${this.baseUrl}`,resource);
  }
}
