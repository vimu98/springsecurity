package com.springsecurity.springsecurity.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @PostMapping("/change-password")
    public String changePassword(@RequestParam String newPassword) {
        // This simulates a dangerous operation
        return "Password changed to: " + newPassword;
    }
}
