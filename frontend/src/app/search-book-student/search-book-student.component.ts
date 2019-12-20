import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search-book-student',
  templateUrl: './search-book-student.component.html',
  styleUrls: ['./search-book-student.component.css']
})
export class SearchBookStudentComponent implements OnInit {

  books: any;
  constructor(private http: HttpClient) {
    this.getData();
  }
  getData() {
    this.http.get<any>('http://localhost:8080/libraryms/showBooks').subscribe(data => {
      console.log(data);
      this.books = data.booksDetails;
    });
  }
  ngOnInit() {
  }

}


