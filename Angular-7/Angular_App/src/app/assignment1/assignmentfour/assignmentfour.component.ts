import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-assignmentfour',
  templateUrl: './assignmentfour.component.html',
  styleUrls: ['./assignmentfour.component.css']
})
export class AssignmentfourComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  loginform(form: NgForm) {
    console.log(form.value);
      }
}
