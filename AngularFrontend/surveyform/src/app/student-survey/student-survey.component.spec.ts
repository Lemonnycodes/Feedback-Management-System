//Katherine Soltani (G01191765), Sharadha Shivakumar (G01390373),Swathi Dharma Sankaran(G01351215), Nikhitha Kalinga(G01382843)

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentSurveyComponent } from './student-survey.component';

describe('StudentSurveyComponent', () => {
  let component: StudentSurveyComponent;
  let fixture: ComponentFixture<StudentSurveyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [StudentSurveyComponent]
    });
    fixture = TestBed.createComponent(StudentSurveyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
