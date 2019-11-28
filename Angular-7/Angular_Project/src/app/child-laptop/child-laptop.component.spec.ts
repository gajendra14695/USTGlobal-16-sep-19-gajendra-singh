import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildLaptopComponent } from './child-laptop.component';

describe('ChildLaptopComponent', () => {
  let component: ChildLaptopComponent;
  let fixture: ComponentFixture<ChildLaptopComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildLaptopComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildLaptopComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
