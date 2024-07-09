package com.gaurav.ImageUpload.services;

import java.util.List;

import com.gaurav.ImageUpload.model.LivingRoom;

public interface LivingRoomService {

	public LivingRoom saveData(LivingRoom lr); 
	
	public List<LivingRoom> getAll();

	
	
}
