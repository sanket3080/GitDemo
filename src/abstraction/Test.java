package abstraction;

public class Test {
	
	public static void main(String[] args) {
		Shape s1=new Circle("Red",6.9);
		Shape s2=new Rectangle("Brown", 6, 8);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
