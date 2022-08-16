package me.dio.academia.digital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello DIO Java Devs";
	}

}