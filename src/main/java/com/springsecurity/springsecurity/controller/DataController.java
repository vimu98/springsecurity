package com.springsecurity.springsecurity.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080/")
public class DataController {
    @GetMapping("/data")
    public String getSensitiveData() {
        return "Sensitive user data";
    }
}