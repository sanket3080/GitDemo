package classesExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Car();
		System.out.println("Default make of the car is: "+car.getMake());
		
		//setting the make of the car by passing desired make to the setter method
		car.setMake("TATA");
		car.setModel("Safari");
		car.setDoors(5);
		car.setColor("Red");
		car.setConvertible(false);
		System.out.println("Make of the car is: "+car.getMake());
		System.out.println("Model of the car is: "+car.getModel());
		
		car.describeCar();
	

	}

}
