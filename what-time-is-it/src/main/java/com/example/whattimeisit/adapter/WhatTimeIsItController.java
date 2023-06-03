package com.example.whattimeisit.adapter;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.whattimeisit.adapter.service.WhatTimeIsItService;

import java.io.IOException;
import java.time.LocalDateTime;

@RestController
public class WhatTimeIsItController {
    private final WhatTimeIsItService service;

    public WhatTimeIsItController(WhatTimeIsItService service) {
        this.service = service;
    }

    @GetMapping(
        value = "/what-time-is-it",
        produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> hello() throws IOException {
        System.out.println("Handle request in:" + LocalDateTime.now());
        return ResponseEntity
            .ok()
            .contentType(MediaType.valueOf(MediaType.IMAGE_PNG_VALUE))
            .body(service.getImage());
    }
}
