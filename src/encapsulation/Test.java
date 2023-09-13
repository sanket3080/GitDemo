package encapsulation;

public class Test {
	public static void main(String[] args) {
		
		Student student=new Student();
		
		student.setName("Jon Snow");
		student.setAge(27);
		student.setRollNo(1);
		
		System.out.println("Student's Name: "+student.getName());
		System.out.println("Student's Age: "+student.getAge());
		System.out.println("Student's RollNo: "+student.getRollNo());

	}
}
