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

  login() {
    if (this.username.value == 'admin' && this.password.value == 'admin') {
      alert('Login successful!');
    } else {
      alert('Login failed!');
    }
  }

}
