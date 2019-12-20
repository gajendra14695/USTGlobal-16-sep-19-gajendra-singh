import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-librarian',
  templateUrl: './librarian.component.html',
  styleUrls: ['./librarian.component.css']
})
export class LibrarianComponent implements OnInit {

  constructor(private service : AuthService) { }
  get isLLoggedIn() {
    return this.service.isLibrarianLoggedIn();
  }

  get isSLoggedIn() {
    return this.service.isStudentLoggedIn();
  }
  ngOnInit() {
  }

}
