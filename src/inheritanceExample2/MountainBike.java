package inheritanceExample2;

public class MountainBike extends Bicycle{
	public int seatHeight;
	
	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight=seatHeight;
	}
	
	public void setHeight(int newHeight) {
		seatHeight=newHeight;
	}

	@Override
	public String toString() {
		return (super.toString()+"\nSeat height is "+seatHeight);
	}
	
	

}
