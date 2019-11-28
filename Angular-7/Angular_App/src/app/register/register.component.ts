import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit ,DoCheck ,AfterViewInit ,AfterViewChecked  , OnDestroy{
  ngOnDestroy() {
    console.log("ngondestroy function is implemented.");
  }
  constructor( private service: UserService) { 
    console.log('Constructor  is Executed');
    this.getData();
  }
 
// tslint:disable-next-line: member-ordering
Users ;
// tslint:disable-next-line: member-ordering
selectedUser ;
today =new Date();
  ngAfterViewChecked() {
    console.log(' ngAfterViewChecked is implemented.');
  }

  ngOnInit() {
    console.log(" ngoninit  is Executed");
  }
  ngDoCheck(){
    console.log('Docheck is Executed');
  }
  ngAfterViewInit() {
    console.log(' Method not implemented. ');
  }
 
  loginform(form: NgForm) {

console.log(form.value);
this.service.postUser(form.value).subscribe(data => {
  console.log(data);
  this.getData();
} , err => {
  console.log(err);
} , () => {
  console.log( 'data posted successfully' ) ;
})
  }

  getData() {
    this.service.getUsers().subscribe(data =>{
      console.log(data);
      this.Users = data;
} , err => {
  console.log(err);
} , () => {
  console.log( 'data posted successfully' ) ;
})
  }
  deleteData(user) {
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data=>{
      console.log(data);
      this.getData();
    }, err=>{
      console.log(err);
    },
    ()=>
    {
      console.log("data deleted successfully");
    })
  }
  selectUser(user) {
    console.log(user);
    this.selectedUser =user;
  }
  updateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.id , form.value).subscribe(data =>{
      console.log(data);
    }, err => {
      console.log(err);
    },
    () => {
      console.log('data updated successfully ');
    })
  }

}
