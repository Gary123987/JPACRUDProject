package com.skilldistillery.workoutlog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.skilldistillery.workoutlog.data.WorkoutDAO;
import com.skilldistillery.workoutlog.entities.Workout;

@Controller
public class WorkoutController {
	
	@Autowired
	private WorkoutDAO dao;
	
	@GetMapping(path = {"/", "index"})
	public String home(Model model) {
		List<Workout> workouts = dao.findAll();
		model.addAttribute("workouts", workouts);
		return "index";
		
	}
	
	

}
