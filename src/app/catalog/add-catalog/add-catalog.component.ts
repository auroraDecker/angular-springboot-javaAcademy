import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
//allows us access to http requests
import { CatalogService } from 'src/app/services/catalog.service';
//Our provider that will perform the http requests
import { Catalog } from 'src/app/Dtos/catalog';
//Our DTO object that will get passed to ther server
@Component({
  selector: 'app-add-catalog',
  templateUrl: './add-catalog.component.html',
  styleUrls: ['./add-catalog.component.css']
})
export class AddCatalogComponent {
//Our constructer will have httpClient that will allows http requests 
//and of Catalog Service that will contains the methods we want to call (catalog.module.ts)
constructor(private http:HttpClient,private service:CatalogService){}

//DTO object that will be passed to the server 
catalog:Catalog = {
  catalogId: 0,
  inventoryId:0,
  description: ' '
}
//Save method that will not return anything
saveCatalog():void{
  //Dto object being set by values in the html using ngModel
  const catalog={
  catalogId: this.catalog.catalogId,
  inventoryId: this.catalog.inventoryId,
  description: this.catalog.description
  };
  //Now we call to the server and subscribe to the Oberserble array
this.service.save(catalog)
  .subscribe({
    next: (res)=>{
      console.log(res)
    }
  })
}
}
