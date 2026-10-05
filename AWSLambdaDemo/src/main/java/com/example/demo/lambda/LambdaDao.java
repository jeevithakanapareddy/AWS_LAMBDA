package com.example.demo.lambda;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LambdaDao {

	@CrossOrigin
	 @GetMapping("/hello")
	    public String hello() {
	        return "Hello from Spring Boot Lambda";
	    }
}
