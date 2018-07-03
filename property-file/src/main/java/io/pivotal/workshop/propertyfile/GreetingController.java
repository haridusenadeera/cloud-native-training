package io.pivotal.workshop.propertyfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Value("${message}")
    private String message;

    @RequestMapping("/")
    public String greeting() {
        return message;
    }
}