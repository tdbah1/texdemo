package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonController {
	@RequestMapping("/getname")
	public String getName() {
		return "Pushing to Github with SSHkey to MAIN or MASTER";
	}

}
