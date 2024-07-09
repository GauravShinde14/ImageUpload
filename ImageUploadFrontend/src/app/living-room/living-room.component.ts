import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { LivingRoom } from '../models/living-room';
import { LivingroomService } from '../services/livingroom.service';

@Component({
  selector: 'app-living-room',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './living-room.component.html',
  styleUrl: './living-room.component.css'
})
export class LivingRoomComponent implements OnInit{

  lr:LivingRoom[] = []

  constructor(private lrs:LivingroomService){

  }
  ngOnInit(): void {
   this.getAlllr()
  }


  getAlllr(){
    this.lrs.getAll().subscribe((data:LivingRoom[])=>{
      if(data!=null){
        this.lr=data
      }
    })
  }
}
