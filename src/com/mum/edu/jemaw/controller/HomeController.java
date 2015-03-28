package com.mum.edu.jemaw.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome() {
		
			return "home";
	}
	
	@RequestMapping("/welcome/greeting")
	public String greeting(Model model) {
		model.addAttribute("greeting", "Welcome to Web Store!");
		model.addAttribute("tagline", "The one and only amazing web store");
		

		return "welcome";
	}
}
