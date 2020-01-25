package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path="/hello")
	public HelloWorldBean hello()
	{
		return new HelloWorldBean("hello");
		
	}
}
