package com.springboot.rest.example.springbootrestdemo;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greeting {
	
	@RequestMapping("/greeting")
	public @ResponseBody String greeting(@RequestParam Optional<String> name) {
		return "hello "+name.orElse("Not provided");
		//http://localhost:8080/greeting?name=mahi
	}

}
