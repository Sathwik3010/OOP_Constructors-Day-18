package com.codegnan.oopexample;

public class MenuItem {
	private String name;
	private double price;
	private String category;
	
	
	public MenuItem(String name, double price, String category) throws Exception{
		if(name == null || name.trim().isEmpty()) {
            throw new Exception("Error: Name must not be empty");
		}
		if(price <=0 ) {
            throw new Exception("Error: Price must be positive");
		}
		if(category == null || category.trim().isEmpty()) {
            throw new Exception("Error: Category must not be empty");
		}
//		super();
		this.name = name;
		this.price = price;
		this.category = category;
		
	}
	
	public void displayItem() {
        System.out.println("Item: " + name + ", Price: " + price + ", Category: " + category);
	}

}
