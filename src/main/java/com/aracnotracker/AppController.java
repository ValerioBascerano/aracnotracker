package com.aracnotracker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("")
	public String viewHomePage() {

		 return "index";
	}
	
	@GetMapping("/registrazione")
	public String showSignUpForm(Model model) {
		model.addAttribute("utente", new Utente());
		return "signup_form";
	}
}
