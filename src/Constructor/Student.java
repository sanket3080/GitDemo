package Constructor;

//copy constructor example
public class Student {
	
	String name;
	int id;
	
	Student(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	Student(Student s1){
		this.name=s1.name;
		this.id=s1.id;
	}
	

}

class CopyConstructor{
	public static void main(String[] args) {
		System.out.println("First object");
		Student s1=new Student("Ned",1);
		System.out.println("Student Name: "+s1.name+", StudentId: "+s1.id);
		
		Student s2=new Student(s1);
		System.out.println("Student 2 Name: "+s2.name+", StudentId2: "+s2.id);
	}
}
