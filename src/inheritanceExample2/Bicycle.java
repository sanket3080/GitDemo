package inheritanceExample2;

public class Bicycle {
	public int gear;
	public int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	
	public void applyBrake(int decrement) {
		speed-=decrement;
		//speed=speed-decrement
	}
	public void speedUp(int increment) {
		speed+=speed;
		//speed=speed+increment
	}

	@Override
	public String toString() {
		return ("No of gears are "+gear+"\n"
				+"speed of the bicycle is "+speed);
	}
	

}
