import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-child-mobiles',
  templateUrl: './child-mobiles.component.html',
  styleUrls: ['./child-mobiles.component.css']
})
export class ChildMobilesComponent implements OnInit {
  @Input() mobiles: {imgurl : string , name : string }
  constructor() { }

  ngOnInit() {
  }

}
