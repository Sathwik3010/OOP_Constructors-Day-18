package com.codegnan.oopexample;

import java.util.Scanner;

public class WorkoutTrackerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			String name = sc.next();
			int price = sc.nextInt();
			double category = sc.nextDouble();
			
			WorkoutTracker WT = new WorkoutTracker(name, price, category);
			WT.displayTrack();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
