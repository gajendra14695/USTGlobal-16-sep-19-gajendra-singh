import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent-cars',
  templateUrl: './parent-cars.component.html',
  styleUrls: ['./parent-cars.component.css']
})
export class ParentCarsComponent implements OnInit {
  selectedcar;
Cars = [ {
  name : 'AMG',
  imgurl : 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
  ratings:' Ratings : 8.8/10',
  // tslint:disable-next-line: max-line-length
  para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',

},
{
  name : 'Lomborghini',
  imgurl : 'https://cdn.pixabay.com/photo/2012/04/12/23/48/car-30990__340.png',
  ratings:' Ratings : 8.8/10',
  // tslint:disable-next-line: max-line-length
  para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',

},
{
  name : 'Sport Car',
  imgurl : 'https://cdn.pixabay.com/photo/2013/07/13/13/22/car-160895__340.png',
  ratings:' Ratings : 8.8/10',
  // tslint:disable-next-line: max-line-length
  para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',

},
{
  name : 'Racing Car',
  imgurl : 'https://cdn.pixabay.com/photo/2012/04/24/14/21/car-40241__340.png',
  ratings:' Ratings : 8.8/10',
  // tslint:disable-next-line: max-line-length
  para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',

},
]
  constructor() { }

  ngOnInit() {
  }
sendcar(car) {
  console.log(car);
  this.selectedcar =car;
}
}
