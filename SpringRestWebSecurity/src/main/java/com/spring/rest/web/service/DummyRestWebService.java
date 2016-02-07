package com.spring.rest.web.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyRestWebService {

	@RequestMapping(value="/sayHello")
	public String sayHello(){
		return "Hello";
	}
}
