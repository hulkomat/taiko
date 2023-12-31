import { Component } from '@angular/core'
import { FormControl, ReactiveFormsModule } from '@angular/forms'
// eslint-disable-next-line @typescript-eslint/consistent-type-imports
import { LoginService } from './login.service'
import type { Credentials } from './credentials'

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.sass'
})
export class LoginComponent {
  constructor (private readonly loginService: LoginService) { }

  username = new FormControl('')
  password = new FormControl('')
  loginMessage = new FormControl('')

  login (): void {
    const credentials: Credentials = { mail: this.username.value ?? '', password: this.password.value ?? '' }
    this.loginService.login(credentials).subscribe(
      result => {
        if (result) {
          this.loginMessage.setValue('Login successful!')
        } else {
          this.loginMessage.setValue('Login failed!')
        }
      }
    )

    // if (this.username.value == 'admin' && this.password.value == 'admin') {
    //   this.loginMessage.setValue('Login successful!');
    // } else {
    //   this.loginMessage.setValue('Login failed!');
    // }
  }
}
