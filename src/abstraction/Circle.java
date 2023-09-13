package abstraction;

public class Circle extends Shape{
	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle constructor called");
		this.radius=radius;
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public String toString() {
		return("Circle color is "+super.getColor()+" and the area is "+area());
	}

}
