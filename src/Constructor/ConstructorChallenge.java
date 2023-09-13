package Constructor;

public class ConstructorChallenge {

	private String name;
	private double creditLimit;
	private String email;
	
	public String getName() {
		return name;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	
	public String getEmail() {
		return email;
	}
	
	public ConstructorChallenge(String name, double creditLimit, String email) {

		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	

	public ConstructorChallenge(String name, String email) {
		this(name,1000,email);
	}
	
	public ConstructorChallenge() {
		this("NoBody", "NoBody@gmail.com");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorChallenge c1=new ConstructorChallenge("Tim", 10000, "tim@gmail.com");
		System.out.println(c1.getName());
		System.out.println(c1.getCreditLimit());
		System.out.println(c1.getEmail());
		
		
		ConstructorChallenge c2=new ConstructorChallenge();
		System.out.println(c2.getName());
		System.out.println(c2.getCreditLimit());
		System.out.println(c2.getEmail());
		

	}

}
