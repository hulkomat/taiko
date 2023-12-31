// eslint-disable-next-line @typescript-eslint/consistent-type-imports
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Injectable } from '@angular/core'
import { type Credentials } from './credentials'
import { type Observable } from 'rxjs'
import { environment } from '../../environments/environment'

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  constructor (private readonly http: HttpClient) { }

  public login (credentials: Credentials): Observable<boolean> {
    return this.http.post<boolean>(environment.backendUrl + '/auth/login', credentials)
  }
}
