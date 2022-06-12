package day12;


public class Functional_Interface {

	public static void main(String[] args) {
		
		Interface1 inter2 = new Interface1() {

			@Override
			public void display(String name) {
				System.out.println(name);
				
			}
			
		};
		inter2.display("Ag Ag");
		
		Interface1 inter3 = (str) -> System.out.println(str);
		inter3.display("Cherry");
		
		Interface3 inter4 = (name,pass) -> {
			if(name.equals("Jeon") && pass.equals("123"))
				return true;
			else
				return false;
		};
		
		System.out.println(inter4.checkLogin("Jeon", "123")? "Login Success" : "Invalid Login");
		System.out.println(inter4.checkLogin("abc", "123")? "Login Success" : "Invalid Login");
		
		Interface2 sum = (a,b) -> a + b;
		Interface2 mul = (a,b) -> a * b;
		Interface2 div = (a,b) -> a/b;
		
		System.out.println("Sum : " + sum.operate(100, 50));
		System.out.println("Multiply : " + mul.operate(100, 50));
		System.out.println("Multiply : " + div.operate(100, 50));
		
	}
}
