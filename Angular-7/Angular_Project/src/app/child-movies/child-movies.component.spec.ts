import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildMoviesComponent } from './child-movies.component';

describe('ChildMoviesComponent', () => {
  let component: ChildMoviesComponent;
  let fixture: ComponentFixture<ChildMoviesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildMoviesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildMoviesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
