package edu.cnm.deepdive.dicewareservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("greet")
    public String greet(String target) {
        return String.format("Hello, %s", target);

    }
}
