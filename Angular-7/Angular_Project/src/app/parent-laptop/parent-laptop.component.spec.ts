import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentLaptopComponent } from './parent-laptop.component';

describe('ParentLaptopComponent', () => {
  let component: ParentLaptopComponent;
  let fixture: ComponentFixture<ParentLaptopComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParentLaptopComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParentLaptopComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
