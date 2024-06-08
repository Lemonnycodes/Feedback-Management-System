//Katherine Soltani (G01191765), Sharadha Shivakumar (G01390373),Swathi Dharma Sankaran(G01351215), Nikhitha Kalinga(G01382843)
//acknowledging the submission of a form when successful by using the student-survey.service that connects with the backend.
import { Component } from '@angular/core';
import { StudentSurveyService } from './student-survey.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student-survey',
  templateUrl: './student-survey.component.html',
  styleUrls: ['./student-survey.component.scss']
})
export class StudentSurveyComponent {
  constructor(private studentSurveyService: StudentSurveyService, private router: Router) {}

  
  FormSubmission(formData: any) {
    console.log(formData);
    this.studentSurveyService.submitSurvey(formData).subscribe(
      (response) => {
        
        window.alert('Form submitted successfully');
        
      },
      (error) => {
       
        console.error('Error submitting the form:', error);
      }
    );
  }

  getAllSurveys() {
    this.studentSurveyService.getAllSurveys().subscribe(
      (surveys) => {
       
        console.log('List of Surveys:', surveys);
        
      },
      (error) => {
       
        console.error('Error getting the surveys:', error);
      }
    );
  }
}
