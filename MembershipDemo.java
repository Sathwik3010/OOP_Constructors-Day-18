package com.codegnan.oopexample;

import java.util.Scanner;

public class MembershipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        try {
	            String name = sc.nextLine();
	            String plan = sc.nextLine();
	            double fee = sc.nextDouble();

	            Membership m = new Membership(name, plan, fee);
	            m.displayMembership();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        sc.close();
	    }
	}


