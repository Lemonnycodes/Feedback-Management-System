//Katherine Soltani (G01191765), Sharadha Shivakumar (G01390373),Swathi Dharma Sankaran(G01351215), Nikhitha Kalinga(G01382843)

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListSurveysComponent } from './list-surveys.component';

describe('ListSurveysComponent', () => {
  let component: ListSurveysComponent;
  let fixture: ComponentFixture<ListSurveysComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListSurveysComponent]
    });
    fixture = TestBed.createComponent(ListSurveysComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
