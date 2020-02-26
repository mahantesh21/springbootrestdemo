package com.springboot.rest.example.springbootrestdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.springboot.rest.example.springbootrestdemo.model.Employee;

@Controller
public class RestClient {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/myapp")
	public @ResponseBody Object getEmployees() {
		String url = "http://localhost:8080/employee/2";
		Employee emp = restTemplate.getForObject(url, Employee.class);
		return emp.toString();

	}

}
