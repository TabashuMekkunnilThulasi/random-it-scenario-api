package com.nhsbsa.scenario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome! The API is running. Try POST /api/generate";
    }
}
