package com.jakubstefcek.restfulwebdemo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// RestAPI 
@RestController
public class HelloWorldController {
	
	// Jednoduchy helloworld API
	@GetMapping(path = "/helloworld")
	public String helloWorld() {
		return "Hello World";
	}
	
	// API ve tvaru JSON s volanim hello world
	@GetMapping(path = "/helloworld-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	// Promenna musi byt stejna s prommenou v methode
	@GetMapping(path = "/helloworld-bean/path/{name}")
	public HelloWorldBean helloWorldPath(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World %s", name));
	}
}
