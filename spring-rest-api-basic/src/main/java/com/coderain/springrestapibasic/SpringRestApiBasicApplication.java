package com.coderain.springrestapibasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringRestApiBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiBasicApplication.class, args);
	}

	@GetMapping
	public String test() {
		return "Test Page";
	}
}
