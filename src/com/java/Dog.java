package com.java;
// Class example with constructor

public class Dog {
	String name;
	String breed;
	int age;
	String color;

	public Dog(String name, String breed, int age, String colour) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = colour;
	}

	public String getName() {
		return this.name;
	}

	public String getBreed() {
		return this.breed;
	}

	public int getAge() {
		return this.age;
	}

	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return ("Hi my name is "+getName()
		+".\nMy breed, age and color are "+getBreed()+", "+getAge()+", "+getColor());
	}

	public static void main(String[] args) {
		Dog tuffy=new Dog("Tuffy","Lab",5,"Grey");
		System.out.println(tuffy.toString());
	}

}
