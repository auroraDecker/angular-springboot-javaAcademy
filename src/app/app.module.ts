import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; // <-- NgModel lives here
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MessagesComponent } from './messages/messages.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { SharedModuleModule } from './shared-module/shared-module.module';
import {MatSidenavModule} from '@angular/material/sidenav'; 
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatListModule} from '@angular/material/list';
import { MatToolbarModule } from "@angular/material/toolbar";
import {MatIconModule} from '@angular/material/icon';
import
  {MatAutocompleteModule,
} from '@angular/material/autocomplete';
import {  MatBadgeModule,
  } from '@angular/material/badge';


@NgModule({
  declarations: [
    AppComponent,
    MessagesComponent,
    LoginComponent
    
    
    
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    SharedModuleModule,
    MatSidenavModule,
    MatSlideToggleModule,
    MatListModule,
    MatAutocompleteModule,
  MatBadgeModule,
  MatIconModule,
  MatToolbarModule
  

 
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
