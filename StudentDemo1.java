package com.codegnan.oopexample;

public class StudentDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("=== Student 1 (Default Constructor) ===");
		Student1 s1 = new Student1();
		 s1.displayDetails();
		 System.out.println("Total Marks: " + s1.calculateTotal());
	     System.out.println("Average Marks: " + s1.calculateAverage());
	     System.out.println("---------------------------------------");
	     
	    System.out.println("=== Student 2 (Parameterized Constructor) ===");
		int[] marks = {50,60,80};
		Student1 s2 = new Student1("Sathwik",101,marks);
		 s2.displayDetails();
		 System.out.println("Total Marks: " + s2.calculateTotal());
	     System.out.println("Average Marks: " + s2.calculateAverage());
	     System.out.println("---------------------------------------");

	}

}
