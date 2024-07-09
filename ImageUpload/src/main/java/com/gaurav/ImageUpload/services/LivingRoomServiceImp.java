package com.gaurav.ImageUpload.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gaurav.ImageUpload.model.LivingRoom;
import com.gaurav.ImageUpload.repository.LivingRoomRepo;

@Service
public class LivingRoomServiceImp implements LivingRoomService {
	
	@Autowired
	@Qualifier("LivingRoomRepo")
	LivingRoomRepo LivingRoomRepo;

	@Override
	public LivingRoom saveData(LivingRoom lr) {
		// TODO Auto-generated method stub
		
		return LivingRoomRepo.save(lr);
	}

	@Override
	public List<LivingRoom> getAll() {
		// TODO Auto-generated method stub
		return LivingRoomRepo.findAll();
	}

}
