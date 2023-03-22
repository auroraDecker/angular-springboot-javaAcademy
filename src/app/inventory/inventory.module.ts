import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InventoryComponent } from './inventory.component';
import { InventoryService } from '../services/inventory.service';
import { AddInventoryComponent } from '../inventory/add-inventory/add-inventory.component';
import { FormsModule } from '@angular/forms';
import { InventoryViewComponent } from '../inventory/inventory-view/inventory-view.component';

@NgModule({
  declarations: [InventoryComponent,AddInventoryComponent,InventoryViewComponent],
  imports: [
    CommonModule,
    FormsModule
  ],
  providers: [InventoryService]
})
export class InventoryModule { }
