package com.codegnan.oopexample;

public class Person {

	private String name;
	private int age;
	private double height;

	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age>=0) {
			this.age = age;
		} else {
			System.out.println("Age cannot be negative");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setHeight(double height) {
		if(height>=0) {
			this.height = height;
		} else {
			System.out.println("height must be positive");
		}
	}
	
	public double getHeight() {
		return height;
	}
	
	// operational methods
	public void introduce() {
		System.out.println("Hello. My Name is: "+name+"i am "+age+" years old and "+height+"meters all");
	}
	
	public boolean isAdult() {
		return age>=18;
		
	}
	public void celebrateBirthday() {
		age++;
		System.out.println("Happy Birthday! "+name+" is now "+age+" years old");
	}
	
	
	// static method. - belongings to class not to instance.
	public static String getSpeciesName() {
		return "Homo sapiense";
	}
	
	
	// final method : cannot be overriden by subclass.
	public final String getIdentification() {
		return name + " ," + age + " Years Old";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
