package com.codegnan.oopexample;

public class Flight {
	 private String flightNumber;
	    private String destination;
	    private double fare;
	    
	 
	public Flight(String flightNumber, String destination, double fare) throws Exception{
		if (flightNumber == null || flightNumber.trim().isEmpty()) {
            throw new Exception("Error: Flight number must not be empty");
        }
        if (destination == null || destination.trim().isEmpty()) {
            throw new Exception("Error: Destination must not be empty");
        }
        if (fare <= 0) {
            throw new Exception("Error: Fare must be positive");
        }
//			super();
			this.flightNumber = flightNumber;
			this.destination = destination;
			this.fare = fare;
		}

		public void displayFlight() {
	        System.out.printf("Flight: %s, Destination: %s, Fare: %.2f%n", flightNumber, destination, fare);
	    }




}
