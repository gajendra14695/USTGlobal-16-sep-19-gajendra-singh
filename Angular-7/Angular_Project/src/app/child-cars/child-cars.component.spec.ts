import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildCarsComponent } from './child-cars.component';

describe('ChildCarsComponent', () => {
  let component: ChildCarsComponent;
  let fixture: ComponentFixture<ChildCarsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildCarsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildCarsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
