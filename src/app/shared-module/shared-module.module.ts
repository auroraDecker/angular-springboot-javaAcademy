import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserModule } from '../user/user.module';
import { ManufacturerModule } from '../manfacturer/manufacturer.module';
import { CatalogModule } from '../catalog/catalog.module';
import { InventoryModule } from '../inventory/inventory.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    UserModule,
    ManufacturerModule,
    CatalogModule,
    InventoryModule
  ]
})
export class SharedModuleModule { }
