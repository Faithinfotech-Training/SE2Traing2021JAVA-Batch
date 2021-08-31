import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagerResourceEnquirySummaryComponent } from './manager-resource-enquiry-summary.component';

describe('ManagerResourceEnquirySummaryComponent', () => {
  let component: ManagerResourceEnquirySummaryComponent;
  let fixture: ComponentFixture<ManagerResourceEnquirySummaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManagerResourceEnquirySummaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagerResourceEnquirySummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
