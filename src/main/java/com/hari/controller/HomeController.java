package com.hari.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/welcome")
	public String hello() {
		return "Welcome to my World!!!";
	}
	
	@GetMapping("/wish")
	public String wish(@RequestParam String name) {
		return "Hello " + StringUtils.capitalize(name) + ", Wish you all the best in this world!!!";
	}

}
