import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  constructor(private auth: AuthService, private router: Router) { }
  addBooks(form: NgForm) {
    console.log(form.value);
    this.auth.addBooks(form.value).subscribe(response => {
      console.log('response of add books', response);
      if (response !== 0) {
        alert('Book added');
        this.router.navigateByUrl('/search-Book');
      }
      form.reset();
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }

}
