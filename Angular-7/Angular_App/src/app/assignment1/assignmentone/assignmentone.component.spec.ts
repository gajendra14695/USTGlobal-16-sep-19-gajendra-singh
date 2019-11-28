import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AssignmentoneComponent } from './assignmentone.component';

describe('AssignmentoneComponent', () => {
  let component: AssignmentoneComponent;
  let fixture: ComponentFixture<AssignmentoneComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AssignmentoneComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AssignmentoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
