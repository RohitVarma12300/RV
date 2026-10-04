package com.example.spring.controller;

import com.example.spring.entity.User;
import org.springframework.web.bind.annotation.*;

//packages
//controller -> where the routes live and from where the control will go to any other part

// services

//repositories

//Entity

//controller , service , repository ,entity


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
        return "rohit  Same here" ;
    }

    @PostMapping("/user")
    public String user(@RequestBody User user){
        return "user name " +user.getName() + " user email "+user.getEmail();
    }

}
