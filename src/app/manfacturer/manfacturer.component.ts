import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { ManfacturerService } from '../services/manfacturer.service';

@Component({
  selector: 'app-manfacturer',
  templateUrl: './manfacturer.component.html',
  styleUrls: ['./manfacturer.component.css']
})
export class ManfacturerComponent {
  constructor(private manService:ManfacturerService){
  }
manufacturers = new Observable<any>;
ngOnInit():void{
  this.manufacturers = this.manService.findAll();

}
}
