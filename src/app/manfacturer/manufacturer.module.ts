import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ManfacturerComponent } from './manfacturer.component';
import { ManfacturerService } from '../services/manfacturer.service';
import { ManufacturerFormComponent } from './manufacturer-form/manufacturer-form.component';
import { ManufacturerViewComponent } from './manufacturer-view/manufacturer-view.component';
import { NgModel } from '@angular/forms';
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [ManfacturerComponent, ManufacturerFormComponent, ManufacturerViewComponent],
  imports: [
    CommonModule,
    FormsModule
  ],
  providers:[ManfacturerService]
})
export class ManufacturerModule { }
