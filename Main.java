package com.codegnan.oopexample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person();
		p.setName("malli");
		p.setAge(25);
		p.setHeight(5.7);
		p.getName();
		p.getAge();
		p.getHeight();
		//operational 
		p.introduce();
		p.celebrateBirthday();
		System.out.println(p.isAdult());
//		p.introduce();
		
		System.out.println(Person.getSpeciesName());
		System.out.println(p.getIdentification());
	}

}
