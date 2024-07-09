package com.gaurav.ImageUpload.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gaurav.ImageUpload.model.LivingRoom;
import com.gaurav.ImageUpload.services.LivingRoomService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class HomeController {
	
	@Autowired
	LivingRoomService lsr;
	
	public static String uploadDirectory = System.getProperty("user.dir")+"/src/main/webapp/images";
	
	@GetMapping("/")
	public String home() {
		return "hello world";
	}
	
	
	@PostMapping("/")
	public LivingRoom insert(@ModelAttribute LivingRoom lr, @RequestParam("image") MultipartFile file) throws IOException {
		
		String originalFileName=file.getOriginalFilename();
		Path fileNameAndPath = Paths.get(uploadDirectory,originalFileName);
		Files.write(fileNameAndPath,file.getBytes());
		
		lr.setPhoto(originalFileName);
//		 lr.setPhoto("/images/" + originalFileName);
		return lsr.saveData(lr);
	}
	
	@GetMapping("/livingroom")
	public List<LivingRoom> get(){
		return lsr.getAll();
	}
	

}
