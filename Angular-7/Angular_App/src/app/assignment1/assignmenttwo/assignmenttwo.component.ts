import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-assignmenttwo',
  templateUrl: './assignmenttwo.component.html',
  styleUrls: ['./assignmenttwo.component.css']
})
export class AssignmenttwoComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  loginform(form: NgForm) {
    console.log(form.value);
      }
}
