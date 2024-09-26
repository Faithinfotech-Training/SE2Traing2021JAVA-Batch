import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CourseListComponent } from './course-list.component';

<<<<<<< HEAD
describe('CourseListComponent', () => {
=======
describe('ResourceListComponent', () => {
>>>>>>> e8c576eeb3e8836865cdc27ea4af1f8f286e7a72
  let component: CourseListComponent;
  let fixture: ComponentFixture<CourseListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CourseListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CourseListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
