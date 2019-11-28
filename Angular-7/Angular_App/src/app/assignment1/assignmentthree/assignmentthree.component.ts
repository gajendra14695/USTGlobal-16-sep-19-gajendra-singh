import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-assignmentthree',
  templateUrl: './assignmentthree.component.html',
  styleUrls: ['./assignmentthree.component.css']
})
export class AssignmentthreeComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  loginform(form: NgForm) {
    console.log(form.value);
      }

}
