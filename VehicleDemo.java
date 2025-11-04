package com.codegnan.oopexample;

import java.util.Scanner;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			 String type = sc.nextLine();
	            String license = sc.nextLine();
	            int hours = sc.nextInt();

	            Vehicle v = new Vehicle(type, license, hours);
	            v.displayVehicle();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
