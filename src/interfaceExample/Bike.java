package interfaceExample;

public class Bike implements Vehicle{

	int speed;
	int gear;
	@Override
	public void changeGear(int newGear) {
		// TODO Auto-generated method stub
		gear = newGear;
	}
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed+=increment;
		
	}
	@Override
	public void applyBrakes(int decrement) {
		// TODO Auto-generated method stub
		
		speed-=decrement;
	}
	
	public void printStates() {
		System.out.println("Speed: "+speed+" gear: "+gear);
	}
	
	
}
