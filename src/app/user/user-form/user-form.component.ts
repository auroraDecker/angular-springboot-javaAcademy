import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../../services/user.service';
import { usersDTOs } from 'src/usersDTO';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent {
  user: usersDTOs = {
    username: ' ',
    id: 0,
    password: ' ',
    role: ' '
  };

  constructor(
    private route: ActivatedRoute, 
      private router: Router,
      private http:HttpClient,
        private userService: UserService) {
  }
  submitted = false;
  //comment on this
saveUser(): void{
  const user={
    id: this.user.id,
  username: this.user.username,
  password:this.user.password,
  role:this.user.role
};
//comment on this 
this.userService.save(user)
  .subscribe({
    next: (res)=>{
      console.log(res);
      this.submitted = true;
    }
  })
};
//comment on thus
newUser():void{
  this.submitted = false,
  this.user = {
    id: 0,
    username: ' ',
    password: ' ',
    role: ' '
 
  }
}
  gotoUserList() {
    this.router.navigate(['/users']);
  }
}
