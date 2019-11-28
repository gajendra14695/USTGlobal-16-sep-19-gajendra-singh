import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildMobilesComponent } from './child-mobiles.component';

describe('ChildMobilesComponent', () => {
  let component: ChildMobilesComponent;
  let fixture: ComponentFixture<ChildMobilesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildMobilesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildMobilesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
