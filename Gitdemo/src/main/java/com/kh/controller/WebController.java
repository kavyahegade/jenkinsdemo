package com.kh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	
	@GetMapping("/hello")
	public String sayHello() {
		   return "Hello World";
	}
	//written by another developer
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi World";

}
