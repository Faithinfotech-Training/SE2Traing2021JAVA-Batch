import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagerSiteVisitViewComponent } from './manager-site-visit-view.component';

describe('ManagerSiteVisitViewComponent', () => {
  let component: ManagerSiteVisitViewComponent;
  let fixture: ComponentFixture<ManagerSiteVisitViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManagerSiteVisitViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagerSiteVisitViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
