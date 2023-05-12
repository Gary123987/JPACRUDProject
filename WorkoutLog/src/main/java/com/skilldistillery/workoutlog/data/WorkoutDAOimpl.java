package com.skilldistillery.workoutlog.data;

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
		return em.createQuery(query).getResultList();
	}

	@Override
	public Workout create(Workout workout) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Workout update(int id, Workout workout) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
