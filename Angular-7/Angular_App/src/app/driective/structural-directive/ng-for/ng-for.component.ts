import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
products =[
  {img : 'https://cdn.pixabay.com/photo/2017/04/06/16/57/auto-2208807__340.png',
  name : 'CAR',
  price : 3000099,

  },
  {img : 'https://cdn.pixabay.com/photo/2019/08/27/11/36/old-houses-4433982__340.jpg',
  name : 'Watch',
  price : 1099,

  },
  {img : 'https://cdn.pixabay.com/photo/2018/05/13/17/08/booklet-3397145__340.jpg',
  name : 'BOOKLET',
  price : 399,

  },
]
  constructor() { }

  ngOnInit() {
  }

}
