import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { UserModule } from './user/user.module';
import { UserViewComponent } from './user/user-view/user-view.component';
import { InventoryViewComponent } from './inventory/inventory-view/inventory-view.component';
import { ManufacturerViewComponent } from './manfacturer/manufacturer-view/manufacturer-view.component';
import { CatalogViewComponent } from './catalog/catalog-view/catalog-view.component';
export const routes = [
  {path: 'first-component', component: UserViewComponent, label:'User View'},
  {path:'second-component',component: ManufacturerViewComponent, label:'Manufacturer View'}, 
  {path:'catalog', component: CatalogViewComponent, label:'Catalog View'}, 
  {path:'inventory', component: InventoryViewComponent, label:'Inventory View'}];

@NgModule({
  imports: [RouterModule.forRoot(routes), BrowserModule],
  exports: [RouterModule],

})
export class AppRoutingModule {

   }
