package com.spring.security.youtube.spilca.spring_security_youtube_spilca_lesson10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo() {
        return "demo";
    }
}
