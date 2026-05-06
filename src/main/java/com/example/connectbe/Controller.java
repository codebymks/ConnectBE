package com.example.connectbe;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "connectfe-production-a986.up.railway.app")
public class Controller {

    @GetMapping("/")
    public ResponseEntity<String> root(){
        return ResponseEntity.ok("Backend is running!");
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Test");
    }
}
