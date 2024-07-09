import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { LivingRoom } from '../models/living-room';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LivingroomService {
  serverurl="http://localhost:9090"
  constructor(private http:HttpClient) { }


  getAll():Observable<LivingRoom[]>
  {
    return this.http.get<LivingRoom[]>(this.serverurl+"/livingroom")
  }

  insert(formData:FormData):Observable<LivingRoom>
  {
    return this.http.post<LivingRoom>(this.serverurl+"/",formData)
  }
}
