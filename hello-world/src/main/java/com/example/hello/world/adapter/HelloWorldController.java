package com.example.hello.world.adapter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        System.out.println("Handle request in:" + LocalDateTime.now());
        return ResponseEntity.ok().body("""
            {
              "data": "Hello World!"
            }""");
    }
}
