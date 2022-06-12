package day11;

public class MethodOverriding {

	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.work();
		
		dev = new FrontEndDeveloper();
		dev.work();
		
		dev = new BackendDeveloper();
		dev.work();
	}
}
class Developer {
	void work() {
		System.out.println("Some Work");
	}
	//abstract void test();
}

class FrontEndDeveloper extends Developer {
	@Override
	void work() {
		System.out.println("doing frontend technologies");
	}
}
class BackendDeveloper extends Developer {
	@Override
	void work() {
		System.out.println("doing backend technologies");
	}
	
}