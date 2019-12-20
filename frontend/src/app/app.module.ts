import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

import { Routes, RouterModule } from '@angular/router';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { LibrarypageComponent } from './librarypage/librarypage.component';
import { AddBookComponent } from './add-book/add-book.component';
import { DisplayBookComponent } from './display-book-student/display-book.component';
import { DisplayComponent } from './display/display.component';
import { LibrarianComponent } from './librarian/librarian.component';
import { SearchbookComponent } from './searchbook/searchbook.component';
import { GetallComponent } from './getall/getall.component';
import { SearchBookStudentComponent } from './search-book-student/search-book-student.component';
import { FilterPipe } from './filter.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    LibrarypageComponent,
    AddBookComponent,
    DisplayBookComponent,
    DisplayComponent,
    LibrarianComponent,
    SearchbookComponent,
    GetallComponent,
    SearchBookStudentComponent,
    FilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'home', component: HomeComponent },
      { path : 'login' , component : LoginComponent},
      { path : 'register' , component: RegisterComponent},
      { path : 'librarian' , component: LibrarianComponent},
      { path : 'library' , component : LibrarypageComponent},
      { path: 'home', component: HomeComponent },
      { path: 'display-book-student', component: DisplayBookComponent },
      { path: 'display-book' , component: DisplayComponent},
      { path: 'getall' , component: GetallComponent},
      { path: 'add-book', component: AddBookComponent },
    { path : 'search-Book' , component: SearchbookComponent},
    { path : 'search-book-student' ,component: SearchBookStudentComponent}
     
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
