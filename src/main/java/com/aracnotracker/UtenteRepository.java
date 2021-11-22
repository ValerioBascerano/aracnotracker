package com.aracnotracker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UtenteRepository extends JpaRepository<Utente, Long> {

	@Query("SELECT u from Utente u WHERE u.email = ?1")
	Utente findByEmail(String email);
}
