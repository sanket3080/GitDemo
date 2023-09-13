package abstraction;

public class Rectangle extends Shape{
	
	private double width;
	private double length;
	
	public Rectangle(String color, double width, double length) {
		super(color);
		System.out.println("Rectangle constructor called");
		this.width=width;
		this.length=length;
	}
	
	public double area() {
		return width*length;
	}
	
	public String toString() {
		return "Rectangle color is "+super.getColor()+" and the area is "+area();
	}
	
	

}
