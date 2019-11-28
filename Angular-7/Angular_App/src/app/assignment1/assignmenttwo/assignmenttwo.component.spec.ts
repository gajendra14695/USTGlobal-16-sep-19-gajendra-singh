import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AssignmenttwoComponent } from './assignmenttwo.component';

describe('AssignmenttwoComponent', () => {
  let component: AssignmenttwoComponent;
  let fixture: ComponentFixture<AssignmenttwoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AssignmenttwoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AssignmenttwoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
