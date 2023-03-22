import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Inventory } from '../Dtos/inventory';
import {  Observable} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class InventoryService {
inventoryUrl:string
  constructor(private http: HttpClient) {
    this.inventoryUrl = 'http://localhost:8080/api/inventory';
  }
  //Returns all from any obserble

  //findAll w/o pageable
  public findAll(): Observable<Inventory[]> {
    return this.http.get<Inventory[]>(this.inventoryUrl)
  }
  public save(inventory: Inventory):Observable<any>{
    return this.http.post<Inventory>(this.inventoryUrl, inventory)
  }
}
