package com.in28minutes.learnspringsecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringSecurityPlayResource {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping(path = "/csrf-token")
    public CsrfToken retrieveCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }



}
