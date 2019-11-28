import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {

  movies;
  movie: any;
  constructor( private http : HttpClient) {
  
   }

  ngOnInit() {
  }
  get(event) {
    this.movie = event.target.value;
    this.http.get<any>('http://www.omdbapi.com/?apikey=14cc9d0b&s=' + this.movie).subscribe(data => {
      this.movies = data.Search;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('movies got succesfully');
    });
  }
}
