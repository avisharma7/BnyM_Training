package com.example.storage_service_dbms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "ImageData")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ImageData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    private String name;

    @Lob
    @Column(name = "imageData")
    private byte[] imageData;


}
