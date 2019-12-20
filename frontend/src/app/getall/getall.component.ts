import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-getall',
  templateUrl: './getall.component.html',
  styleUrls: ['./getall.component.css']
})
export class GetallComponent implements OnInit {

  users: any;
  constructor(private http: HttpClient, private service: AuthService) {
    this.getData();
  }
  getData() {
    this.http.get<any>('http://localhost:8080/libraryms/showUser').subscribe(data => {
      console.log(data);
      this.users = data.user;
    });
  }
  ngOnInit() {
  }

}
