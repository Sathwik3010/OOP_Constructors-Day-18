package com.codegnan.oopexample;

public class Product {
	    private String name;
	    private double price;
	    private int quantity;
	    
	    
	public Product(String name, double price, int quantity) throws Exception{
			if(name == null || name.trim().isEmpty()) {
	            throw new Exception("Error: Name must not be empty");
			}
			if(price<0) {
	            throw new Exception("Error: Price must be positive");
			}
			if(quantity<0) {
	            throw new Exception("Error: Quantity must be non-negative");
			}
//			super();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}

	public void displayProduct() {
        System.out.println("Product: " + name + ", Price: " + price + ", Quantity: " + quantity);
	}


}
