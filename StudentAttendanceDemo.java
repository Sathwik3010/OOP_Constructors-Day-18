package com.codegnan.oopexample;

import java.util.Scanner;

public class StudentAttendanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Student ID: ");
			int id = sc.nextInt();
            sc.nextLine(); // consume newline

			System.out.print("Enter Student Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Attendance Status (Present/Absent): ");
			String status = sc.nextLine();
			
			StudentAttendance sa= new StudentAttendance(id,name ,status);
			sa.displayAttendance();
		} catch (Exception e) {
            System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
