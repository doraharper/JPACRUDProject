package com.skilldistillery.jpacrud.entities.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpacrud.entities.Category;
import com.skilldistillery.jpacrud.entities.Exercise;

class Excercise {
	private EntityManagerFactory emf;
	private EntityManager em;
	private Exercise e;

	@BeforeEach
	void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("Exercise");
		em = emf.createEntityManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		emf.close();
	}

	@Test
	@DisplayName("Test Exercise ")
	void test_exercise_mappings() {
		e = em.find(Exercise.class, 1);
		// assertEquals(1, a.getId());
		assertEquals("Muster Thruster", e.getName());
		assertEquals("You really have to muster all your energy for this, and then some. ", e.getDescription());
		
	}
}
