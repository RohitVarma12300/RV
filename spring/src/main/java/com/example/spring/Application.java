package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	//localhost:8080 ~ amazon.com
	//locahost/ ->root route (amazon.com/)
	//locahost/user -> user route (amazon.com/users)
	//localhost/application ->application route

	//when we request to server through HTTP protocol then it has different verb/method
	//url, method, content-type and different metadata
	//url -> localhost (other ex google.com)
	//method
	// get some impormation from the server ->GET
	// post/give some information on to the server  ->POST
	// delete some information from the server -> DELETE


	//what ever starts from @ is basically annotation
	//whay annotation is required
	// it tells the spring project what we need to do

	// @SpringBootApplication - Main Spring application
	//@RestController - This class will handle all the rest API
	// @GetMapping - it basically handles get request
	// @postMapping - it handles post request

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
