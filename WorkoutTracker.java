package com.codegnan.oopexample;

public class WorkoutTracker {
	private String name;
	private int steps;
	private double calories;
	
	
	public WorkoutTracker(String name, int steps, double calories) throws Exception{
		if(name == null || name.trim().isEmpty()) {
			throw new Exception("Error: Name must not be empty");
		}
		if(steps<0) {
			throw new Exception("Error: Steps must not be negative");
		}if(calories<0) {
			throw new Exception("Error: calories must not be negative");
		}
//		super();
		this.name = name;
		this.steps = steps;
		this.calories = calories;
	}

	public void displayTrack(){
		System.out.println("Name: " + name + ", steps: " + steps + ", calories: " + calories);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
