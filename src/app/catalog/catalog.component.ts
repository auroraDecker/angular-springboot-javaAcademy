import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { CatalogService } from '../services/catalog.service';

@Component({
  selector: 'app-catalog',
  templateUrl: './catalog.component.html',
  styleUrls: ['./catalog.component.css']
})
export class CatalogComponent {
  constructor(private service:CatalogService){
  }
  catalogs= new Observable<any>
  ngOnInit():void{
    this.catalogs = this.service.findAll();
  }
}
