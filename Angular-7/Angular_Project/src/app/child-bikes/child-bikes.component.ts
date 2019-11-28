import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-child-bikes',
  templateUrl: './child-bikes.component.html',
  styleUrls: ['./child-bikes.component.css']
})
export class ChildBikesComponent implements OnInit {
  @Input() bikes: {imgurl : string , name : string };
  constructor() { }

  ngOnInit() {
  }

}
