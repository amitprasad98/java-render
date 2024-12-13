package com.personal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping(value = "/health")
    @CrossOrigin(origins = { "http://localhost:3000" })
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("Java - Render Service Status - Up", HttpStatus.OK);
    }
}
