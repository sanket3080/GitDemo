package com.java;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5 ft 8 inches= "+convertTOCentimeters(5,8)+" cm");
		System.out.println("68 inches= "+convertToCentimeters(60)+" cm");
		

	}
	
	public static double convertTOCentimeters(int feet, int inches) {
		return convertToCentimeters((feet*12)+inches);
		
	}
	
	public static double convertToCentimeters(int inches) {
		return inches*2.54;
	}

}
