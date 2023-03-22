import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CatalogComponent } from './catalog.component';
import { CatalogService } from '../services/catalog.service';
import { CatalogViewComponent } from '../catalog/catalog-view/catalog-view.component';
import { AddCatalogComponent } from '../catalog/add-catalog/add-catalog.component';
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [CatalogComponent, CatalogViewComponent,AddCatalogComponent],
  imports: [
    CommonModule,FormsModule
  ],
  providers:[CatalogService]
})
export class CatalogModule { }
