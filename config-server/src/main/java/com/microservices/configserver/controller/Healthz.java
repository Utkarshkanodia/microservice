package com.microservices.configserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Healthz {

    @Value("${spring.application.name}")
    private final String appName = new String();

    @Value("${spring.profiles.include}")
    private final List<String> activeProfile = new ArrayList<>();

    @GetMapping("/healthz")
    public String profile() {
        return "OK from:- " + appName + " service with active profile: " + activeProfile;
    }
}
