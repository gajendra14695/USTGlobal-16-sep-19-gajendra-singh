import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-assignmentone',
  templateUrl: './assignmentone.component.html',
  styleUrls: ['./assignmentone.component.css']
})
export class AssignmentoneComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  companyForm(form: NgForm ) {
    console.log(form.value);
      }
    }
