package com.in28minutes.learnspringsecurity;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
    @GetMapping(path = "/hello-world")
    public String helloWorld(Authentication authentication){
        System.out.println(authentication);
        System.out.println(authentication.getPrincipal());
        return "Hello World v1";
    }



}
