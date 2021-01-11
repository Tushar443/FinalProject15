import { Component } from '@angular/core';
import{FormBuilder} from '@angular/forms'
import { UserLogin } from './Classes/user-login';
import {LoginServiceService} from './login-service.service'
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private fb :FormBuilder,private service:LoginServiceService){}

  property:object =new UserLogin();

   user:UserLogin =new UserLogin() ;
  callFunction(){
    this.service.AddUser()
      .subscribe(arg => this.property = arg);
    
  }
}
