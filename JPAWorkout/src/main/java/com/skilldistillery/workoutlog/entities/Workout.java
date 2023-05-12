package com.skilldistillery.workoutlog.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Workout {
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	
	private LocalDate date;
	
	
	
	
	@Override
	public String toString() {
		return "Workout [id=" + id + ", date=" + date + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Workout() {
		super();
	}

}
