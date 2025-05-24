package com.springsecurity.springsecurity.controller;

import org.owasp.encoder.Encode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XssController {
    @PostMapping("/submit")
    public String formHandle(@RequestParam String comment) {
        return  "<div>" + Encode.forHtml(comment) + "</div>";
    }
}