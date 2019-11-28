import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent-mobiles',
  templateUrl: './parent-mobiles.component.html',
  styleUrls: ['./parent-mobiles.component.css']
})
export class ParentMobilesComponent implements OnInit {
  Mobiles = [ {
    name : 'SmartPhone',
    imgurl : 'https://cdn.pixabay.com/photo/2013/07/12/18/39/smartphone-153650__340.png',
    ratings:' Ratings : 8.8/10',
     // tslint:disable-next-line: max-line-length
     para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
  
  
  },
  {
    name : 'Samsung',
    imgurl : 'https://cdn.pixabay.com/photo/2016/03/27/19/43/smartphone-1283938_960_720.jpg',
    ratings:' Ratings : 6.7/10',
    // tslint:disable-next-line: max-line-length
    para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
  
  },
  {
    name : 'Samsang J2',
    imgurl : 'https://cdn.pixabay.com/photo/2015/02/04/12/38/smartphone-623722__340.jpg',
    ratings:' Ratings : 9/10',
    // tslint:disable-next-line: max-line-length
    para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
  
  },
  {
    name : 'Iphone',
    imgurl : 'https://cdn.pixabay.com/photo/2018/01/08/02/34/technology-3068617__340.jpg',
    ratings:' Ratings : 8/10',
     // tslint:disable-next-line: max-line-length
     para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
  
  },
  ]
  selectedmobiles ;
  constructor() { }

  ngOnInit() {
  }
  sendmobiles(mobiles) {
    console.log(mobiles);
this.selectedmobiles =mobiles;
  }
}
