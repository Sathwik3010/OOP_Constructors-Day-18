package com.codegnan.oopexample;

public class StudentAttendance {

	private int id;
	private String name;
	private String status;
	

	public StudentAttendance(int id, String name, String status) throws Exception{
		if(id<=0) {
            throw new Exception("Error: ID must be positive");
		}
		if(name==null || name.trim().isEmpty()) {
            throw new Exception("Error: Name must be not Empty");
		}
		if(!status.equalsIgnoreCase("Present")&& !status.equalsIgnoreCase("Absent")) {
			throw new Exception("Error: Status must be \"Present\" or \"Absent\"");
		}
//		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	   public void displayAttendance() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Status: " + status);
	    }

}
