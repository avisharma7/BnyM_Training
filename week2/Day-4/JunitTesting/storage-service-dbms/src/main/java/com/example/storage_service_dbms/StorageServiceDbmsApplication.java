package com.example.storage_service_dbms;

import com.example.storage_service_dbms.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@SpringBootApplication
@RestController
@RequestMapping("/image")
public class StorageServiceDbmsApplication {



	@Autowired
	private StorageService storeService;

	@PostMapping
	public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file) throws IOException {
		String uploadImage = storeService.uploadImage(file);
		return ResponseEntity.status(HttpStatus.OK).body(uploadImage);
	}

	@GetMapping("/{filename}")
	public ResponseEntity<?> downloadImage(@PathVariable String filename)
	{
		byte[] imageData=storeService.downloadImage(filename);
		return  ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png"))
				.body(imageData);

	}
	public static void main(String[] args) {
		SpringApplication.run(StorageServiceDbmsApplication.class, args);
	}

}
