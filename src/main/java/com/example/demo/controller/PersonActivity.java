package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonActivity {
	@RequestMapping("/getact")
	public String getAct() {
		return "get activity to Push to Github to MASTER";
	}
}