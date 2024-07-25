package com.example.storage_service_dbms.service;

import com.example.storage_service_dbms.entity.ImageData;
import com.example.storage_service_dbms.repository.StorageRepo;
import com.example.storage_service_dbms.util.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;
import java.util.Optional;

@Service
public class StorageService {
    @Autowired
    private StorageRepo repo;

    public String uploadImage(MultipartFile file) throws IOException {
        ImageData imageData = ImageData.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .imageData(ImageUtils.compressImage(file.getBytes()))
                .build();

        repo.save(imageData);

        return "Image uploaded successfully: " + file.getOriginalFilename();
    }
    public byte[] downloadImage(String filename)
    {
         Optional<ImageData> dbImageData= repo.findByName(filename);
      byte[] img= ImageUtils.decompressImage(dbImageData.get().getImageData());
        return img;
    }
}
