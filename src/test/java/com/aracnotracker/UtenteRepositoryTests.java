//package com.aracnotracker;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class UtenteRepositoryTests {
//
//	@Autowired
//	private UtenteRepository repo;
//	
//	@Autowired
//	private TestEntityManager entityManager;
//	
//	@Test
//	public void testCreaUtente() {
//		Utente utente = new Utente();
//		utente.setEmail("cristoforo.colombo@hotmail.it");
//		utente.setPassword("colomboa1b2c3");
//		utente.setNome("Cristoforo");
//		utente.setCognome("Colombo");
//	
//		Utente utenteSalvato = repo.save(utente);
//		
//		Utente existUtente = entityManager.find(Utente.class, utenteSalvato.getId());
//		
//		assertThat(existUtente.getEmail()).isEqualTo(utente.getEmail());
//		
//	}
//}
