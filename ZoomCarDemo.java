package com.codegnan.oopexample;

import java.util.Scanner;

public class ZoomCarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Brand : ");
	          String brand = sc.nextLine();

	          System.out.print("Enter Model : ");
	          String model = sc.next();

	          System.out.print("Enter price Level: ");
	          int grade = sc.nextInt();

	          ZoomCar zc = new ZoomCar(brand,model,grade);
	          zc.displayCarInfo();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally{
			sc.close();
		}
	}

}
