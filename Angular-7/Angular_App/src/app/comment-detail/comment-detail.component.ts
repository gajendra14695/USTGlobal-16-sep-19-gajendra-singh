import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comment-detail',
  templateUrl: './comment-detail.component.html',
  styleUrls: ['./comment-detail.component.css']
})
export class CommentDetailComponent implements OnInit {
comments : any[] =[];
  constructor() { }

  ngOnInit() {
  }
  getAllComments(childData) {
console.log('childData',childData);
this.comments.push(childData);
  }
}
