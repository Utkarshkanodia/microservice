package com.microservices.servicea.controllers;


import com.microservices.servicea.configurations.LimitConfiguration;
import com.microservices.servicea.dtos.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
public class LimitController {

    @Autowired
    private LimitConfiguration limitConfiguration;


    @GetMapping
    public Limits limit() {
        return new Limits(limitConfiguration.getMinimum(),
                limitConfiguration.getMaximum());
    }
}
