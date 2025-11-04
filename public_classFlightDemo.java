package com.codegnan.oopexample;

import java.util.Scanner;

public class public_classFlightDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			 String flightNumber = sc.nextLine();
	            String destination = sc.nextLine();
	            double fare = sc.nextDouble();
			Flight pcf = new Flight(flightNumber, destination, fare);
			pcf.displayFlight();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			sc.close();
		}
	}

}
