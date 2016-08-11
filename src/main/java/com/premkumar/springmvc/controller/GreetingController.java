package com.premkumar.springmvc.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	@PostConstruct
	public void init() {
		System.out.println("-------------------------------------------------------------------------");
	}

	@RequestMapping(value = "/greeting", method = { RequestMethod.GET })
	public @ResponseBody String sayHello() {
		return "hello user!!!";
	}

	@RequestMapping(value = "/greetUser", method = { RequestMethod.GET })
	public @ResponseBody String sayHelloCustomized(@RequestParam(defaultValue = "") String name) {
		name = name == null || name.trim().length() == 0 ? "Guest" : name.trim();
		return "hello " + name + "!!!";
	}
}
