package com.premkumar.springmvc.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	@PostConstruct
	public void init(){
		System.out.println("-------------------------------------------------------------------------");
	}
	
	@RequestMapping(value="/greeting",method={RequestMethod.GET})
	public @ResponseBody String sayHello(){
		return "hello user!!!";
	}
}
