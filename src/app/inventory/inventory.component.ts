import { Component } from '@angular/core';
import { InventoryService } from '../services/inventory.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css']
})
export class InventoryComponent {
constructor(private service:InventoryService){}
inventories = new Observable<any>

ngOnInit():void{
  this.inventories = this.service.findAll();
}
}
