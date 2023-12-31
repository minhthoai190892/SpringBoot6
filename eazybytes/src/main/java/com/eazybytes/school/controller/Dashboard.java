package com.eazybytes.school.controller;

import javax.management.RuntimeErrorException;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dashboard {
	@RequestMapping("/dashboard")
	public String displayDashboard(Model model,Authentication authentication) {
		model.addAttribute("username",authentication.getName());
		model.addAttribute("roles",authentication.getAuthorities().toString());
//		throw new RuntimeException("It's been a bad day");
		return "dashboard.html";
	}
}
