import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AssignmentfourComponent } from './assignmentfour.component';

describe('AssignmentfourComponent', () => {
  let component: AssignmentfourComponent;
  let fixture: ComponentFixture<AssignmentfourComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AssignmentfourComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AssignmentfourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
