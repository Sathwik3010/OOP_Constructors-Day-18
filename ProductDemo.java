package com.codegnan.oopexample;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 try {
	            String name = sc.nextLine();
	            double price = sc.nextDouble();
	            int quantity = sc.nextInt();

	            Product p = new Product(name, price, quantity);
	            p.displayProduct();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        sc.close();
	}

}
