import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }
  isLLoggedIn = false;
  isSLoggedIn = false;
  baseURL = 'http://localhost:8080';

  register(user): Observable<any> {
    return this.http.post('http://localhost:8080/libraryms/register', user);
  }
  login(user): Observable<any> {
    return this.http.post('http://localhost:8080/libraryms/login', user);
  }
  addBooks(user): Observable<any> {
    return this.http.post('http://localhost:8080/libraryms/addBooks', user);
  }
  deleteBook(bid): Observable<any> {
    return this.http.delete(`${'http://localhost:8080/libraryms/deleteBook'}/${bid}`);
  }
  updateUser( data): Observable<any> {
    return this.http.put('http://localhost:8080/libraryms/update', data);
  }

  isLibrarianLoggedIn() {
    if (this.isLLoggedIn) {
      return true;
    }
    return false;
  }

  isStudentLoggedIn() {
    if (this.isSLoggedIn) {
      return true;
    }
    return false;
  }
}
