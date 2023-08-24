package com.eazybytes.school.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private static Logger log = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String displayLoginPage(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
				String errorMessge = null;
				if (error !=null) {
					errorMessge="Username or Password is incorrect !!";
				}
				if (logout!=null) {
					errorMessge="You have been successfully logout";
				}
				model.addAttribute("errorMessge",errorMessge);
				
		return "login.html";

	}
}
