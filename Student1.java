package com.codegnan.oopexample;

import java.util.Arrays;

public class Student1 {
	private String name;
	private int rollNumber;
	private int[] marks=new int[3];
	
	public Student1(){
		this.name="Unknown";
		this.rollNumber=0;
		this.marks=new int[] {0,0,0};
	}
	
	public Student1(String name, int rollNumber, int[]marks){
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	
	public void displayDetails() {
		System.out.println("RollNumber: "+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+Arrays.toString(marks));

	}
	
	public int calculateTotal() {
		int total=0;
		for(int mark: marks) {
			total+=mark;
		}
		return total;
	}
	
	public double calculateAverage() {
		
		return calculateTotal()/3.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
