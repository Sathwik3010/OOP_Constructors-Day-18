package com.codegnan.oopexample;

import java.util.Scanner;

public class MenuItemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			 String name = sc.nextLine();
	         double price = sc.nextDouble();
	         sc.nextLine();
	         String category = sc.nextLine();

	         MenuItem mi = new MenuItem(name, price, category);
	         mi.displayItem();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
