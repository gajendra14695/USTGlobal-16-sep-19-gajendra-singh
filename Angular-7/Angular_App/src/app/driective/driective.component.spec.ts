import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DriectiveComponent } from './driective.component';

describe('DriectiveComponent', () => {
  let component: DriectiveComponent;
  let fixture: ComponentFixture<DriectiveComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DriectiveComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DriectiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
