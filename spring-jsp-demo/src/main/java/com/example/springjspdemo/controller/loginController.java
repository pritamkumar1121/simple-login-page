package com.example.springjspdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String dataPage(ModelMap model, @RequestParam String userId, @RequestParam String password) {
		if (userId.equals("admin") && password.equals("root")) {
			return "data";
	}
		model.put("errorMsg", "Please Enter Correct UserID And Password");
		return "login";

    }
}