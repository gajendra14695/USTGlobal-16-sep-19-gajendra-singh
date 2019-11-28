import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {  ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
// import { HomeComponent } from './home/home.component';
import { ParentCarsComponent } from './parent-cars/parent-cars.component';
import { ChildCarsComponent } from './child-cars/child-cars.component';
import { ChildBikesComponent } from './child-bikes/child-bikes.component';
import { ChildMoviesComponent } from './child-movies/child-movies.component';
import { ChildLaptopComponent } from './child-laptop/child-laptop.component';
import { ChildMobilesComponent } from './child-mobiles/child-mobiles.component';
import { ParentMobilesComponent } from './parent-mobiles/parent-mobiles.component';
import { ParentLaptopComponent } from './parent-laptop/parent-laptop.component';
import { ParentMoviesComponent } from './parent-movies/parent-movies.component';
import { ParentbikesComponent } from './parentbikes/parentbikes.component';
import { ParenthomeComponent } from './parenthome/parenthome.component';
import { ChildhomeComponent } from './childhome/childhome.component';

@NgModule({
  declarations: [
    AppComponent,
    // FormsModule,
    RegisterComponent,
    HeaderComponent,
    ParentCarsComponent,
    ChildCarsComponent,
    ChildBikesComponent,
    ChildMoviesComponent,
    ChildLaptopComponent,
    ChildMobilesComponent,
    ParentMobilesComponent,
    ParentLaptopComponent,
    ParentMoviesComponent,
    ParentbikesComponent,
    ParenthomeComponent,
    ChildhomeComponent
  ],
  imports: [
    BrowserModule, 
    // FormsModule,
    ReactiveFormsModule,
  RouterModule.forRoot([
    { path: 'parenthome', component: ParenthomeComponent },
    {path: 'parentcars', component: ParentCarsComponent },
    {path: 'parentbikes', component: ParentbikesComponent },
    {path: 'parentmovies', component: ParentMoviesComponent },
    {path: 'parentlaptop', component: ParentLaptopComponent },
    {path: 'parentmobiles', component:  ParentMobilesComponent },
  ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
