package com.ssl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class sslController {
	
	@GetMapping("/get")
	public String welcome() {
		return "Welcome to Access Page";
	}

}
