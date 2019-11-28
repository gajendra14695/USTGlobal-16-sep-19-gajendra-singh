import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {

  constructor()   {  
    
    setInterval( () => {
      this.isActive = !this.isActive ;
    } , 20 )
  }
  colorName= 'red';
  color = 'blue';
  isActive = true;


  ngOnInit() {
  }

}
