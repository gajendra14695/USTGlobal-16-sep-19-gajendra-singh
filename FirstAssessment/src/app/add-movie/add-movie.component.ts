import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgModel } from '@angular/forms';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {
  get am() {
    return this.form.get('am');
  }
  get at() {
    return this.form.get('at');
  }
  get ai() {
    return this.form.get('ai');
  }
  get md() {
    return this.form.get('md');
  }
  constructor() { }
  form = new FormGroup({
    am : new FormControl ('', [Validators.required ]),
    at : new FormControl('', [Validators.required]),
    ai : new FormControl('', [Validators.required]),
    md : new FormControl('', [Validators.required])
    
  } )

  ngOnInit() {
  }
  logindata(form : NgModel){
    console.log(form.value);
  }
}
