package com.jhdemo.microservices.limitsservice;

import com.jhdemo.microservices.limitsservice.bean.LimitsConfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LimitsConfigurationController
 */
@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations() {
        return new LimitsConfiguration(1000, 1);
    }
}