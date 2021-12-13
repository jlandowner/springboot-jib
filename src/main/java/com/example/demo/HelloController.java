package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

@RestController
public class HelloController {

    private static final Logger logger = LogManager.getLogger("HelloWorld");

	@GetMapping("/")
	public String index(@RequestHeader Map<String, String> headers) {
		headers.forEach((key, value) -> {
			logger.info(String.format("Header '%s' = %s", key, value));
		});
		return "Greetings from Spring Boot!";
	}

}