import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
username:String = " ";
password:String = " ";
show: boolean = false;
submit(){
  console.log("Username is: " + this.username)
  
}

}
