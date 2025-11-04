package com.codegnan.oopexample;

public class ZoomCar {
	private String brand;
	private String model;
	private int price;
	
	
	public ZoomCar(String brand, String model, int price) throws Exception {
		if(brand == null || brand.trim().isEmpty()) {
			throw new Exception("Error: brand cannot be empty");
		} if(model == null || model.trim().isEmpty()) {
			throw new Exception("Error: model cannot be empty");
		} if(price<0) {
			throw new Exception("Error: price cannot be negative");
		}
//		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	
	public void displayCarInfo() {
		System.out.println("brand: "+brand+ ", model: "+ model+ ", price: " + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
