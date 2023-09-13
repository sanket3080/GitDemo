package pojo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		for(int i=1;i<=5;i++) {
			Student s=new Student("S02300"+i, 
					switch(i){
						case 1 ->"Tryion";
						case 2 ->"John";
						case 3 ->"Arya";
						case 4 ->"Sansa";
						case 5 ->"Cersi";
						default ->"Anonymus";
					},
					"01/01/2000",
					"Java MasterClass");
			System.out.println(s);
		}
		
		for(int i=1;i<=5;i++) {
			LPAStudent s=new LPAStudent("Record_"+i, 
					switch(i){
						case 1 ->"Tryion";
						case 2 ->"John";
						case 3 ->"Arya";
						case 4 ->"Sansa";
						case 5 ->"Cersi";
						default ->"Anonymus";
					},
					"01/01/2000",
					"Java MasterClass");
			System.out.println(s);
		}
		
		Student pojoStudent=new Student("S023006","Rob","11/11/1995","King In the North class");
		LPAStudent recordStudent=new LPAStudent("Record_6", "Hodor","01/11/990", "Hold The Door class");
		
		System.out.println(pojoStudent);
		System.out.println(recordStudent);
		
		System.out.println(pojoStudent.getName()+" is taking "+pojoStudent.getClassList());
		System.out.println(recordStudent.name()+ " is taking "+recordStudent.classList());
	}

}
