package com.microservices.servicea.configurations;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app.limit")
@Getter
@Setter
public class LimitConfiguration {
    private int minimum;
    private int maximum;
}
