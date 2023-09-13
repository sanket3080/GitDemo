package Constructor;
//Parameterized constructor example

public class Person {
	
	
	Person(String name){
		System.out.println("Constructor with one argument - String: "+name);
	}
	
	Person(String name, int age){
		System.out.println("Constructor with two arguments - string and integer: "+name+" "+age);
	}
	
	Person(long id){
		System.out.println("Constructor with one argument - Long : "+id);
	}
	
	public static void main(String[] args) {
		Person p1=new Person("Tyrion");
		
		Person p2= new Person("John",23);
		
		Person p3= new Person(99999999);
	}

}
