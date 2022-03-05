package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCntontroller {
@GetMapping("/")
	 public String greeting()
	 {
		  return "Welcome to Test ";
	 }
}
