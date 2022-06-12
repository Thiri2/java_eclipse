package day9.pkg2;

import day9.pkg1.A;

public class D {

	void test() {
		A obj = new A();
		//obj.number = 100; //cant access , diff package
		//obj.emp_id = 101;
		obj.name = "Hla"; //public
	}
}
