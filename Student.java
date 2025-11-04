package com.codegnan.oopexample;

import java.util.Scanner;

public class Student {
	int rollNumber;
	String name;
	
	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	public void display() {
		System.out.println("RollNumber: "+rollNumber);
		System.out.println("Name: "+name);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rollNumber=sc.nextInt();
		String name = sc.next();
		Student s1 =new Student(rollNumber, name);
		s1.display();
		sc.close();
	}

}
