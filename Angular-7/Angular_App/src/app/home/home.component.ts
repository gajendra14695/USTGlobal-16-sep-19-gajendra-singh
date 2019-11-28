import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
news;
  constructor( private http : HttpClient) {
    this.getNews();
   }

  ngOnInit() {
  }
getNews(){
  this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=30525bd3323040789d35cfdb9f01ebd9').subscribe(data =>{
    this.news =data.articles;
  })
}
}
