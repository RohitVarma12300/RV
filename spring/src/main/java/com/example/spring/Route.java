package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Route {
    // when anyone comes to our website that is localhost -> localhost:8080/
    @GetMapping("/")
    public String root(){
       return " You just Hit the root route" ;
    }

    // create a get route for "rohit" and the give some response
    @GetMapping("/rohit")
    public String rohit(){
        return "rohit" ;
    }

    @PostMapping("/xyz")
    public String xyz(){
        return "xyz";
    }

}
