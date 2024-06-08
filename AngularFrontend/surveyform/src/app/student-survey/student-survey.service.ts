//Katherine Soltani (G01191765), Sharadha Shivakumar (G01390373),Swathi Dharma Sankaran(G01351215), Nikhitha Kalinga(G01382843)

// student-survey-service.ts file is responsible for connecting the frontend with the spring boot backend using the methods initialized in them.

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class StudentSurveyService {
  private backendlink = 'http://localhost:8080'; 
  constructor(private http: HttpClient) {}

  submitSurvey(survey: any): Observable<any> {
    return this.http.post(`${this.backendlink}/submitSurvey`, survey);
  }
  getAllSurveys(): Observable<any> {
    return this.http.get(`${this.backendlink}/getAllSurvey`);
  }
}
