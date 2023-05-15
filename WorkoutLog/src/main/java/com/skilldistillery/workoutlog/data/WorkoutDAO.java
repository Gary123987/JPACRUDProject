package com.skilldistillery.workoutlog.data;

import java.util.List;

import com.skilldistillery.workoutlog.entities.Workout;



public interface WorkoutDAO {
	
	Workout findById(int id);
	List<Workout> findAll();
	Workout create(Workout workout);
	boolean deleteById(int id);
	Workout update(int id, Workout workout);
	

}
