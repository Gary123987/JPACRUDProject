package com.skilldistillery.workoutlog.data;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.workoutlog.entities.Workout;

@Service
@Transactional
public class WorkoutDAOimpl implements WorkoutDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Workout findById(int id) {
		Workout workout = em.find(Workout.class, id);
		return workout;
	}

	@Override
	public List<Workout> findAll() {
		String query = "select w from Workout w";
		List<Workout> workouts =  em.createQuery(query).getResultList();
		return workouts;
	}

	@Override
	public Workout create(Workout workout) {
		em.persist(workout);
		return workout;
	}

	@Override
	public Workout update(int id, Workout updatedWorkout) {
		Workout workout = findById(id);
		workout = updatedWorkout;
		em.merge(workout);
		return workout;
	}

	@Override
	public boolean deleteById(int id) {
		Workout workout = findById(id);
		em.remove(workout);
		return false;
	}


}
