package com.example.SpringBootFileManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {
    private String fileName;
    private String urlName;
    private String fileType;
    private long fileSize;

    public ResponseData(String fileName, String downloadURl, String contentType, long size) {
    }
}
