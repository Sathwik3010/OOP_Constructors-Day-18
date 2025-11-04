package com.codegnan.oopexample;

import java.util.Scanner;

public class StudentRegistrationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		  System.out.print("Enter Student Name: ");
          String name = sc.nextLine();

          System.out.print("Enter Roll Number: ");
          int roll = sc.nextInt();

          System.out.print("Enter Grade Level: ");
          int grade = sc.nextInt();

		StudentRegistration sr = new StudentRegistration( name, roll, grade);
		sr.showProfile();
		} catch(Exception e) {
            System.out.println(e.getMessage());
		} finally {
            sc.close();
		}
	}

}
