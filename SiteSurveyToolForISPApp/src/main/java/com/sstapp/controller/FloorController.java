package com.sstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

//import com.sstapp.repository.FloorRepository;
import com.sstapp.service.FileStorageService;

@RestController
@RequestMapping("/api/floor")
public class FloorController {

//    @Autowired
//    private FloorRepository floorRepo;

    @Autowired
    private FileStorageService service;

    @PostMapping("/upload")
    public String uploadFile(@RequestBody MultipartFile file) throws Exception {
        return service.upLoad(file);
    }
}
