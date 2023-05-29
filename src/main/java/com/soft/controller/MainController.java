package com.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController{

	@RequestMapping("/index")
	public String homepage() {
		return"index";
	}
	@RequestMapping("/userForm")
	public String userFormData() {
		return"userForm";
	}
}
