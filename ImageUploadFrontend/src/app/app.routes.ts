import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LivingRoomComponent } from './living-room/living-room.component';
import { AddFurnitureComponent } from './add-furniture/add-furniture.component';

export const routes: Routes = [
    
    {path:"livingroom",component:LivingRoomComponent},
    {path:"home",component:HomeComponent},
    {path:"add",component:AddFurnitureComponent}
];
