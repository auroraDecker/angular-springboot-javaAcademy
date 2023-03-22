import { Component } from '@angular/core';
import { UserService } from '../services/user.service';
import { Observable,of } from 'rxjs';
import { usersDTOs } from '../../usersDTO';
import { UserFormComponent } from './user-form/user-form.component';
@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
  //The parameter defines a private UserService and identifes it as the UserService Injection Site
  //now hereService parameter to the singleton instance of UserService
constructor(private userService:UserService){
}
//users is a type of any array
users = new Observable<any>;
//this.users = this.userService.getUsers(); will not work becuase it is a synchrous call. bc we are calling to the backend we must make it type of Observable
//Observable allows Angular to use HttpClient.get method and return an Observable

ngOnInit():void{
  this.users = this.userService.findAll();

}
user = new usersDTOs;
}
