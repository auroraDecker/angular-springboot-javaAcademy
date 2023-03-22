import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Inventory } from 'src/app/Dtos/inventory';
import { InventoryService } from 'src/app/services/inventory.service';
@Component({
  selector: 'app-add-inventory',
  templateUrl: './add-inventory.component.html',
  styleUrls: ['./add-inventory.component.css']
})
export class AddInventoryComponent {

  //make a constructor that will accpt HTTPClient 
  //HTTPClient will be available as an injectable class, These have the methods to perform HTTP requests.
  //service:inventoryService will be service we are injecting into this componenet class
  constructor(private http:HttpClient,private service:InventoryService) {}
//Setting a variable name inventory as type inventory
inventory:Inventory = {
  inventoryId:0,
  serialNumber:0,
  numberOfWheels:0,
  manufacturerId:0,
  color:''

};
  //save inventory
  //The html will bind to these properites in a form with the use of ([ngModel])
  //Once those values have change the inventory object we will submit the obj to the db 
  saveInventory():void{
//inventory obj setting it equal to itself. It will be bound with ngModel on the html side 
const inventory = {
inventoryId: this.inventory.inventoryId,
serialNumber:this.inventory.serialNumber,
numberOfWheels: this.inventory.numberOfWheels,
manufacturerId:this.inventory.manufacturerId,
color:this.inventory.color
};
this.service.save(inventory)
  .subscribe({
    next: (res)=>{
      console.log(res);
    }
  })
  };
}
