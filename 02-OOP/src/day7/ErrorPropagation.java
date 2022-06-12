package day7;

public class ErrorPropagation {
	//b/c of one here error that's why error in all places
	public static void main(String[] args) {
		test3();
	}

	private static void test3() {

		test2();
	}

	private static void test2() {
		//here too b/c of test1 error
		test1();
	}

	private static void test1() {
		System.out.println(100/3); //exception here
	}
}
