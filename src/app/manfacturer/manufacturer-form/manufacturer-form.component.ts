import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ManfacturerService } from 'src/app/services/manfacturer.service';
import { ManufacturerDTO } from 'src/app/Dtos/manufacturer-dto';
//Our DTO object that will get passed to ther serve
@Component({
  selector: 'app-manufacturer-form',
  templateUrl: './manufacturer-form.component.html',
  styleUrls: ['./manufacturer-form.component.css']
})
export class ManufacturerFormComponent {
  //Our constructer will have httpClient that will allows http requests 
//and of Catalog Service that will contains the methods we want to call (manufacturer.module.ts)
constructor(private http:HttpClient,private service:ManfacturerService){}
submitted = false;
//DTO object that will be passed to the server 
manufacturer: ManufacturerDTO ={
  manufacturerId:0,
  companyName:' '
}

//Save method that will not return anything
saveManufacturer():void{
    //Dto object being set by values in the html using ngModel
const manufacturer={
  manufacturerId: this.manufacturer.manufacturerId,
  companyName: this.manufacturer.companyName
};
  //Now we call to the server and subscribe to the Oberserble array
this.service.save(manufacturer)
  .subscribe({
    next: (res)=>{
      console.log(res);
      this.submitted = true;
    }
  })
};


}