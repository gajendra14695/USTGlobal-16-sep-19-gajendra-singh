import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-child-cars',
  templateUrl: './child-cars.component.html',
  styleUrls: ['./child-cars.component.css']
})
export class ChildCarsComponent implements OnInit {
  @Input() car : {imgurl : string , name : string };
  constructor() { }

  ngOnInit() {
  }

}
