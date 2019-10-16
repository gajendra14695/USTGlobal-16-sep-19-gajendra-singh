import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule } from '@angular/common/http';

import { HeaderComponent } from './header/header.component';
import { MoviesComponent } from './movies/movies.component';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MoviesComponent,
    AddMovieComponent,
    LoginComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
   { path : 'Mo' , component : MoviesComponent},
   { path : 'Amo' , component : AddMovieComponent},
   {path : 'lg', component : LoginComponent}
    ])
  ],
providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
