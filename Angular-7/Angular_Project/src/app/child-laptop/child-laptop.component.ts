import { Component, OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-child-laptop',
  templateUrl: './child-laptop.component.html',
  styleUrls: ['./child-laptop.component.css']
})
export class ChildLaptopComponent implements OnInit {
  @Input() laptop : {imgurl : string , name : string }
  constructor() { }

  ngOnInit() {
  }

}
