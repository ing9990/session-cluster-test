package com.sessioncluster;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingApi {
    @GetMapping
    void greeting(HttpServletRequest request) {
        request.getSession(true)
                .setAttribute("Hello", "world");
    }
}
