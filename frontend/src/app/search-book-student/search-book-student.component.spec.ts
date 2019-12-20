import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchBookStudentComponent } from './search-book-student.component';

describe('SearchBookStudentComponent', () => {
  let component: SearchBookStudentComponent;
  let fixture: ComponentFixture<SearchBookStudentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchBookStudentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchBookStudentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
