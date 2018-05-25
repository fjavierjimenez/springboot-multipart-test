package com.sngular.controller;

import com.sngular.model.Metadata;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class MultipartController {

    @PostMapping(value = "/upload", consumes = {"multipart/form-data"})
    public String fileUpload(@RequestPart(value = "metadata", required = true) Metadata metadata,
                             @RequestPart(value = "file", required = true) MultipartFile file) {
        return "ok";
    }
}

