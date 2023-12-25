import { Component } from '@angular/core';
import { FormControl, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.sass'
})
export class LoginComponent {

  username = new FormControl('');
  password = new FormControl('');
  loginMessage = new FormControl('');

  login() {
    if (this.username.value == 'admin' && this.password.value == 'admin') {
      this.loginMessage.setValue('Login successful!');
    } else {
      this.loginMessage.setValue('Login failed!');
    }
  }

}
