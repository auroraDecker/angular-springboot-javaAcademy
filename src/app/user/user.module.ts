import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserService } from '../services/user.service';
import { UserComponent } from './user.component';
import { UserViewComponent } from './user-view/user-view.component';
import { UserFormComponent } from './user-form/user-form.component';
import { FormsModule } from '@angular/forms'; // <-- NgModel lives here
@NgModule({
  declarations: [
   UserComponent,
   UserViewComponent,
   UserFormComponent

  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  providers: [
      UserService
  ],
})
export class UserModule { }
