package day9.pkg2;

import day9.pkg1.A;

public class F extends A{

	void test() {
		F obj = new F();
		obj.emp_id = 101; //diff package, inherit
		obj.name = "Su Su";
				
		A obj1 = new A();
		obj1.name = "Mg Mg";
		
	}
}
