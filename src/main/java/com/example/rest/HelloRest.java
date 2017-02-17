package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
	
	@RequestMapping(value="/")
	public String getHello(){
		return "hello";
	}
}
