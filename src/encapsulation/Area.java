package encapsulation;

public class Area {
	private double length;
	private double breadth;
	
	public Area(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public void getArea() {
		double area=length*breadth;
		System.out.println("Area: "+area);
	}
	

}
