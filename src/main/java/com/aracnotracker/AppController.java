package com.aracnotracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

	@Autowired
	private UtenteRepository repo;
	
	@GetMapping("")
	public String viewHomePage() {

		 return "index";
	}
	
	@GetMapping("/registrazione")
	public String showSignUpForm(Model model) {
		model.addAttribute("utente", new Utente());
		return "signup_form";
	}
	
	@PostMapping("/processo_registrazione")
	public String processoRegistrazione(Utente utente) {
	repo.save(utente);
	return "registrazione_success";
	}
}
