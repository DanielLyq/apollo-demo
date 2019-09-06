package com.lin.controller;

import com.lin.model.SimpleProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloConfigController {

    @Value("${time:100}")
    private String time;

    @Autowired
    private SimpleProperties simpleProperties;

    @GetMapping("/time")
    public String getTime() {
        return time;
    }

    @GetMapping("/simple")
    public String getSimple() {
        return simpleProperties.getSimple();
    }
}
