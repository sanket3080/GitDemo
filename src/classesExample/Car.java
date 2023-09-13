package classesExample;

public class Car {
	private String make="Tesla";
	private String model="Model X";
	private String color="Grey";
	private int doors=4;
	private boolean Convertible=true;

	public void describeCar() {
		System.out.println(
				doors + " -Door " + color + " " + make + " " + model + " " + (Convertible ? "Convertible" : " "));
	}

	//getter method
	public String getMake() {
		return make;
	}

	//setter method
	public void setMake(String make) {
		if(make==null) {
			make="Unknown";
		}
		String lowerCaseMake=make.toLowerCase();
		switch(lowerCaseMake) {
		case "tata","porsche","tesla" -> this.make=make;
		default ->{
			this.make="Unsupported";
		}
		}
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public boolean isConvertible() {
		return Convertible;
	}

	public void setConvertible(boolean convertible) {
		Convertible = convertible;
	}

}
