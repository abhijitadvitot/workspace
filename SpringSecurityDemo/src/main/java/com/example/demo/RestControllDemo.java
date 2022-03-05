package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllDemo {

	
	
	@GetMapping("/")
	public String greeting() {
		  return "Elcom to my Secuirty";
	}
}
