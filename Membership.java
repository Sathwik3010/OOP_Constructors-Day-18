package com.codegnan.oopexample;

public class Membership {
	 private String memberName;
	    private String planType;
	    private double monthlyFee;
	    
	    public Membership(String memberName, String planType, double monthlyFee) throws Exception {
	        if (memberName == null || memberName.trim().isEmpty()) {
	            throw new Exception("Error: Member name cannot be empty");
	        }
	        if (planType == null || planType.trim().isEmpty()) {
	            throw new Exception("Error: Plan type cannot be empty");
	        }
	        if (monthlyFee <= 0) {
	            throw new Exception("Error: Fee must be positive");
	        }

	        this.memberName = memberName;
	        this.planType = planType;
	        this.monthlyFee = monthlyFee;
	    }

	    // Method to display membership details
	    public void displayMembership() {
	        System.out.println("Member: " + memberName + ", Plan: " + planType + ", Fee: " + monthlyFee);
	    }

}
