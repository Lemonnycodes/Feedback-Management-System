//Katherine Soltani (G01191765), Sharadha Shivakumar (G01390373),Swathi Dharma Sankaran(G01351215), Nikhitha Kalinga(G01382843)

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StudentSurveyComponent } from './student-survey/student-survey.component';
import { ListSurveysComponent } from './list-surveys/list-surveys.component';

const routes: Routes = [
  { path: 'student-survey', component: StudentSurveyComponent },
  { path: 'list-surveys', component: ListSurveysComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
