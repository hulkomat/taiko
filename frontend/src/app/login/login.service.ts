import { type HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core'
import { type Credentials } from './credentials'
import { type Observable } from 'rxjs'
import { BACKEND_URL } from '../app.config'

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  constructor (private readonly http: HttpClient) { }

  public login (credentials: Credentials): Observable<boolean> {
    return this.http.post(BACKEND_URL + '/auth/login', credentials) as Observable<boolean>
  }
}
