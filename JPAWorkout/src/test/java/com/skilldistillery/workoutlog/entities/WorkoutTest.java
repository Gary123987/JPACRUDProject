package com.skilldistillery.workoutlog.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorkoutTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Workout workout;
	
	@BeforeAll
	static void setUpBFA() throws Exception{
		emf = Persistence.createEntityManagerFactory("JPAWorkout");
	}
	@AfterAll
	static void tearDownAA() throws Exception {
		emf.close();
	}
	@BeforeEach
	void setUP() throws Exception {
		em = emf.createEntityManager();
		workout = em.find(Workout.class, 1);
		
	}
	@AfterEach
	void tearDown() {
		em.close();
		workout = null;
	}
	
	@Test
	void testWorkoutEntity() {
		assertNotNull(workout);
		assertEquals("2023-05-12", workout.getDate().toString());
	}
	

}
