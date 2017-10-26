package com.codekul.FirstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication    //treated as startUp of application
public class FirstSpringProjectApplication {

	@RequestMapping(value = "/check")
	String check(){
		return "Welcome....Spring";
	}
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjectApplication.class, args);
	}
}
