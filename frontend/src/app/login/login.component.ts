import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private service: AuthService, private router: Router, private http: HttpClient) { }

  login(form: NgForm) {
    console.log(form);
    this.http.post<any>(`${this.service.baseURL}/libraryms/login`, form.value)
      .subscribe(response => {
        if (response != null && response.type === 'librarian') {
          alert('Login successful');
          console.log('response of login', response);
          this.router.navigateByUrl('/librarian');
          this.service.isLLoggedIn = true;
        } else if (response != null && response.type === 'student') {
          alert('Login successful');
          this.router.navigateByUrl('/home');
          this.service.isSLoggedIn = true;
        } else {
          window.confirm('Login Failed');
        }
      });
  }
  ngOnInit() {
  }

}
