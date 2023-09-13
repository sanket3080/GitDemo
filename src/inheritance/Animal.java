package inheritance;

public class Animal {
	
	private String type;
	private String size;
	private double weight;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Animal(String type, String size, double weight) {
		super();
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	
	public Animal() {
		
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}
	
	public void move(String speed) {
		System.out.println(type+" moves "+speed);
	}
	
	public void makeNoise() {
		System.out.println(type+" makes some noise");
	}
}
