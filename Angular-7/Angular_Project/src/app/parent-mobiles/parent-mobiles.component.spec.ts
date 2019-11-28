import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentMobilesComponent } from './parent-mobiles.component';

describe('ParentMobilesComponent', () => {
  let component: ParentMobilesComponent;
  let fixture: ComponentFixture<ParentMobilesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParentMobilesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParentMobilesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
