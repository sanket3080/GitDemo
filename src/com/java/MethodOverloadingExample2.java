package com.java;

public class MethodOverloadingExample2 {
	public static void main(String[] args) {
		System.out.println("Area of the circle with radius 3 cm is: "+area(3));
		System.out.println("Area of the square with length 5cm and breadth 5.3 cm is: "+area(5,5.3));
		
	}
	
	public static double area(double radius) {
		if(radius<0) {
			return -1;
		}else {
			return radius*radius*Math.PI;
		}
	}
	public static double area(double x, double y) {
		if(x<0||y<0) {
			return -1;
		}else {
			return x*y;
		}
	}

}
