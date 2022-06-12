package day10.inheritance;

public class Demo {
	public static void main(String[] args) {
		Person p1 = new Person("James");
		p1.showInfo();
		
		Teacher t1 = new Teacher("Jeon", "Tutor");
		t1.showInfo();
		
		Person p2 = new Teacher("David", "Instructor");
		p2.showInfo();
		p1.test();
		//p1.display();
		
		//data type casting
		//Person -> Teacher
		int a = 100;
		long b = a; //implicit casting
		
		Person p3 = t1;
		
		Teacher t2 = (Teacher) p2; //cant casting error
		//cant change to p1 b/c data type is Person 
		//classcastexception
		//explicit casting
		
	}

}
