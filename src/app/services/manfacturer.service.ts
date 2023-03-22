import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ManufacturerDTO } from '../Dtos/manufacturer-dto';
import {  Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ManfacturerService {
 
  constructor(private http: HttpClient) {
    this.manufacturersUrl = 'http://localhost:8080/api/manufacturer';
  }
  manufacturersUrl: string;
  public findAll(): Observable<ManufacturerDTO[]> {
    return this.http.get<ManufacturerDTO[]>(this.manufacturersUrl)
  }
  public save(manfacturer: ManufacturerDTO): Observable<any> {
    return this.http.post<ManufacturerDTO>(this.manufacturersUrl , manfacturer);
  }
//public findAll(): Observable<usersDTOs[]> {
 // return this.http.get<usersDTOs[]>(this.usersUrl);
//}

}
