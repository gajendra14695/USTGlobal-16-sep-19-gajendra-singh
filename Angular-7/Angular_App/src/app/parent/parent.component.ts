import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;

  Cars = [{
    name : 'Sport Car',
    imgurl : 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
  },
  {
    name : 'Ferrari',
    imgurl : 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
  },
  {
    name : 'AMG',
    imgurl : 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
  },
  {
    name : 'Lamborgini',
    imgurl : 'https://cdn.pixabay.com/photo/2012/04/12/23/47/car-30984__340.png',
  },
  {
    name : 'Auto',
    imgurl : 'https://cdn.pixabay.com/photo/2017/03/27/14/37/asia-2179107__340.jpg'
  }
]
  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
    
    console.log(car);
    this.selectedCar = car;
  }

}
