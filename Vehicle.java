package com.codegnan.oopexample;

public class Vehicle {
		private String type;
	    private String licensePlate;
	    private int hoursParked;
	    
	    public Vehicle(String type, String licensePlate, int hoursParked) throws Exception {
	        if (type == null || type.trim().isEmpty()) {
	            throw new Exception("Error: Vehicle type must not be empty");
	        }
	        if (licensePlate == null || licensePlate.trim().isEmpty()) {
	            throw new Exception("Error: License plate must not be empty");
	        }
	        if (hoursParked < 0) {
	            throw new Exception("Error: Hours parked must be non-negative");
	        }

	        this.type = type;
	        this.licensePlate = licensePlate;
	        this.hoursParked = hoursParked;
	    }

	    // Method to display vehicle details
	    public void displayVehicle() {
	        System.out.println("Type: " + type + ", License: " + licensePlate + ", Hours Parked: " + hoursParked);
	    }

}
