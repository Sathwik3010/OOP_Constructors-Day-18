package com.codegnan.oopexample;

public class StudentRegistration {
	private String name;
	private int rollNumber;
	private int gradeLevel;
	
	
	public StudentRegistration(String name, int rollNumber, int gradeLevel) throws Exception{
		if(name == null || name.trim().isEmpty()) {
            throw new Exception("Error: Name cannot be empty");
		}
		if(rollNumber<=0) {
			throw new Exception("Error: roll number must be Positive");
		}
		if(gradeLevel < 1 || gradeLevel > 12) {
            throw new Exception("Error: Grade level must be between 1 and 12");
		}
		this.name = name;
		this.rollNumber = rollNumber;
		this.gradeLevel = gradeLevel;
	}

	public void showProfile () {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + gradeLevel);
	}
	

}
