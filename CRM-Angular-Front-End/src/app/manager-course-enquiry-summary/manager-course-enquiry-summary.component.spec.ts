import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagerCourseEnquirySummaryComponent } from './manager-course-enquiry-summary.component';

describe('ManagerCourseEnquirySummaryComponent', () => {
  let component: ManagerCourseEnquirySummaryComponent;
  let fixture: ComponentFixture<ManagerCourseEnquirySummaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManagerCourseEnquirySummaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagerCourseEnquirySummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
