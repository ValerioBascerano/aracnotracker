package com.aracnotracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUtenteDettaglioService implements UserDetailsService {

	@Autowired
	private UtenteRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Utente utente = repo.findByEmail(email);
		if (utente == null) {
			throw new UsernameNotFoundException("Utente non trovato");
			
		}
		return new CustomUtenteDettaglio(utente);
	}

}
