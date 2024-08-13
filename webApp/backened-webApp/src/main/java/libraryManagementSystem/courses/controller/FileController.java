package libraryManagementSystem.courses.controller;

import libraryManagementSystem.courses.bean.FileStorageService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/files")
public class FileController {

    private final FileStorageService fileStorageService;

    public FileController(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        fileStorageService.save(file);
        return ResponseEntity.ok("File uploaded successfully: " + file.getOriginalFilename());
    }

    @GetMapping("/all")
    public ResponseEntity<List<String>> listAllFiles() {
        List<String> fileNames = fileStorageService.loadAll().map(path -> MvcUriComponentsBuilder
                        .fromMethodName(FileController.class, "getFile", path.getFileName().toString()).build().toString())
                .collect(Collectors.toList());

        return ResponseEntity.ok().body(fileNames);
    }

    @GetMapping("/download/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> getFile(@PathVariable String filename) {
        Path file = fileStorageService.load(filename);
        Resource resource;
        try {
            resource = new UrlResource(file.toUri());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}

