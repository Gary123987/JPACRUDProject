package com.skilldistillery.workoutlog.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@GetMapping("/createWorkout.do")
	public String createWorkout() {
		return "create";
	}
	@GetMapping("/createdWorkout.do")
	public String createdWorkout(Model model, 
			@RequestParam("length")int length,
			@RequestParam("intensity")int intesity,
			@RequestParam("muscleGroup")String muscleGroup,
			@RequestParam("date")String sDate) {
		LocalDate date = LocalDate.parse(sDate);
		Workout workout = new Workout();
		workout.setDate(date);
		workout.setIntensity(intesity);
		workout.setLength(length);
		workout.setMuscleGroup(muscleGroup);
		workout = dao.create(workout);
		model.addAttribute("workout",workout);
		return "viewCreated";
	}
	
	@GetMapping("/delete.do")
	public String deleteWorkout(Model model,
			@RequestParam("id") int id) {
		dao.deleteById(id);
		return "deletedWorkout";
	}
	@GetMapping("/updateForm.do")
	public String updateWorkout(Model model,
			@RequestParam("id") int id) {
		Workout workout = dao.findById(id);
		
		model.addAttribute("workout", workout);
		return "updateForm";
	}
	@GetMapping("/update.do")
	public String updatedWorkout(Model model, 
			@RequestParam("length")int length,
			@RequestParam("intensity")int intesity,
			@RequestParam("muscleGroup")String muscleGroup,
			@RequestParam("date")String sDate,
			@RequestParam("id") int id) {
		LocalDate date = LocalDate.parse(sDate);
		Workout workout = dao.findById(id);
		workout.setDate(date);
		workout.setIntensity(intesity);
		workout.setLength(length);
		workout.setMuscleGroup(muscleGroup);
		workout = dao.update(id, workout);
		model.addAttribute(workout);
		
	return "viewUpdated";
	}
}
