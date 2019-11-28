import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent-laptop',
  templateUrl: './parent-laptop.component.html',
  styleUrls: ['./parent-laptop.component.css']
})
export class ParentLaptopComponent implements OnInit {

  Laptops = [ {
    name : 'Apple Smartlaptop',
    imgurl : 'https://cdn.pixabay.com/photo/2016/03/27/07/12/apple-1282241__340.jpg',
    ratings:' Ratings : 8.8/10',
    // tslint:disable-next-line: max-line-length
    para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
 
  },
  {
    name : 'Mac',
    imgurl : 'https://cdn.pixabay.com/photo/2016/03/27/20/00/coffee-1284041__340.jpg',
    ratings:' Ratings : 8.8/10',
    // tslint:disable-next-line: max-line-length
    para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
 
  },
  {
    name : 'Dell',
    imgurl : 'https://cdn.pixabay.com/photo/2017/06/20/23/15/coffee-2425303__340.jpg',
    ratings:' Ratings : 8.8/10',
    // tslint:disable-next-line: max-line-length
    para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
 
  },
  {
    name : 'HP',
    imgurl : 'https://cdn.pixabay.com/photo/2016/03/27/20/12/notebook-1284085__340.jpg',
    ratings:' Ratings : 8.8/10',
    // tslint:disable-next-line: max-line-length
    para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
 
  },
  ]
  selectedlaptop;
  constructor() { }

  ngOnInit() {
  }
  sendlaptop(laptop) {
    console.log(laptop);
    this.selectedlaptop =laptop;
  }

}
