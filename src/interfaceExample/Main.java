package interfaceExample;

public class Main {
	
	public static void main(String[] args) {
		Bicycle cycle=new Bicycle();
		cycle.changeGear(2);
		cycle.speedUp(3);
		cycle.applyBrakes(1);
		
		System.out.println("Bicycle present state: ");
		cycle.printStates();
		
		Bike bike=new Bike();
		bike.changeGear(4);
		bike.speedUp(5);
		bike.applyBrakes(2);
		
		System.out.println("Bike present state: ");
		bike.printStates();
		
	}

}
