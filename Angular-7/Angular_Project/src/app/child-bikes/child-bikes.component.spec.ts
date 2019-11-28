import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildBikesComponent } from './child-bikes.component';

describe('ChildBikesComponent', () => {
  let component: ChildBikesComponent;
  let fixture: ComponentFixture<ChildBikesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildBikesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildBikesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
