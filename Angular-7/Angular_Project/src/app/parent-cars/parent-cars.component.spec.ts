import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentCarsComponent } from './parent-cars.component';

describe('ParentCarsComponent', () => {
  let component: ParentCarsComponent;
  let fixture: ComponentFixture<ParentCarsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParentCarsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParentCarsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
