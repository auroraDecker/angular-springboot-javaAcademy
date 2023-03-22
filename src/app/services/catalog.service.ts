import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {  Observable} from 'rxjs';
import { Catalog } from '../Dtos/catalog';
@Injectable({
  providedIn: 'root'
})
export class CatalogService {

  catalogUrl: string;

  constructor(private http:HttpClient) {
    this.catalogUrl ='http://localhost:8080/api/catalog'
   }
   public findAll(): Observable<Catalog[]> {
    return this.http.get<Catalog[]>(this.catalogUrl)
  }
  public save(catalog: Catalog):Observable<any>{
    return this.http.post<Catalog>(this.catalogUrl, catalog)
  }
}
