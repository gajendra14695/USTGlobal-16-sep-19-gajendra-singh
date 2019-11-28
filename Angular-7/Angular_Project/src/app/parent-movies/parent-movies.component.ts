import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent-movies',
  templateUrl: './parent-movies.component.html',
  styleUrls: ['./parent-movies.component.css']
})
export class ParentMoviesComponent implements OnInit {
  Movies = [ {
    name : 'Charles Chaplin',
    imgurl : 'https://cdn.pixabay.com/photo/2018/07/06/19/48/charles-chaplin-3521070__340.jpg',
    ratings:' Ratings : 8.8/10',
    // tslint:disable-next-line: max-line-length
    para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
 
  },
  {
    name : 'Landscape Water Rock',
    imgurl : 'https://cdn.pixabay.com/photo/2016/04/14/13/06/landscape-1328858__340.jpg',
    ratings:' Ratings : 8.8/10',
    // tslint:disable-next-line: max-line-length
    para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
 
  },
  {
    name : 'Frog Cinema',
    imgurl : 'https://cdn.pixabay.com/photo/2016/09/15/22/53/frog-1672887__340.jpg',
    ratings:' Ratings : 8.8/10',
    // tslint:disable-next-line: max-line-length
    para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
 
  },
  {
    name : 'Denver Colorado',
    imgurl : 'https://cdn.pixabay.com/photo/2016/09/17/16/26/denver-1676444__340.jpg',
    ratings:' Ratings : 8.8/10',
    // tslint:disable-next-line: max-line-length
    para : 'Enjoy a seamless and efficient smartphone experience, thanks to the powerful 2.0 GHz Qualcomm Snapdragon 675 processor. Whether you re playing games, watching videos, or browsing the Internet, the Redmi Note 7 Pro delivers a super-fast performance. It also comes with 64 GB of storage capacity, so you can store all your pictures and music with ease.',
 
  },
  ]
  constructor() { }
  selectedmovies;
  ngOnInit() {
  }
  sendmovies(movies) {
    console.log(movies);
    this.selectedmovies =movies;
  }

}
