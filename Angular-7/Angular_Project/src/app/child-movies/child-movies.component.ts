import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-child-movies',
  templateUrl: './child-movies.component.html',
  styleUrls: ['./child-movies.component.css']
})
export class ChildMoviesComponent implements OnInit {
  @Input() movies: {imgurl : string , name : string }
  constructor() { }

  ngOnInit() {
  }

}
