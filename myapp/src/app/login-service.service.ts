import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor(private httpClient:HttpClient) { }

  AddUser(){
    return this.httpClient.get("https://localhost:8080/AddUser");
  }
  
}
