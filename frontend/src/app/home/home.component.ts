import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  searchValue: String = '';
  constructor(private service :AuthService) { }
  get isLLoggedIn() {
    return this.service.isLibrarianLoggedIn();
  }

  get isSLoggedIn() {
    return this.service.isStudentLoggedIn();
  }

  ngOnInit() {
  }

}
