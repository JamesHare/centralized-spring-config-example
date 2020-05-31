package com.jamesmhare.example.springconfigclientexample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GreetingController {

    @Value("${user.name}")
    private String name;
    @Value("${user.gender}")
    private String gender;
    @Value("${user.planet}")
    private String planet;
    @Value("${config.location}")
    private String configLocation;

    @RequestMapping("/greeting")
    public String getGreeting() {
        return "The properties are [ name = " + name + ", gender = " + gender + ", planet = " + planet
                + ", configLocation = " + configLocation + " ]";
    }

}
