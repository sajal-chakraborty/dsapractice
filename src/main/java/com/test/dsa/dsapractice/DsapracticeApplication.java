package com.test.dsa.dsapractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController

public class DsapracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsapracticeApplication.class, args);
	}

	@GetMapping("/")
	public String getMethodName(@RequestParam("param") String param) {
		return new String("Hello, " + param + " Welcome to DSA Practice Application");
	}
	


}
