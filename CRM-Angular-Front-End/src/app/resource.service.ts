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


  getResourceById(resourceId:number): Observable<Resource>{
    return this.httpClient.get<Resource>(`${this.baseUrl}/${resourceId}`);
 
  }

  updateResource(resourceId:number, resource:Resource):Observable<object>{
    return this.httpClient.put<object>(`${this.baseUrl}/${resourceId}`,resource);
  }


}
