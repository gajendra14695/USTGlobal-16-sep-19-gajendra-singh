import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name: string = 'Gajendra Singh Rajput';
  imgurl = 'https://cdn.pixabay.com/photo/2019/09/25/17/25/baltic-sea-4504178_960_720.jpg';
address : string = 'Randhawapuram Gwalior 475005';
colorName : string = 'red';
isActive : boolean = false;

colspanvalue: number =2 ;

constructor () {}
  ngOnInit() {
    setInterval(() => {
// this.colorName = 'yellow';
this.isActive = !this.isActive;
    }, 2000 )
  }

}
