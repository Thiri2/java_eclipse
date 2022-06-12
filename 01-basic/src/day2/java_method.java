package day2;

public class java_method {
	
	int num1 = 10;//instant field
	static int num2 = 20; //static field
	
	public void instance_method() {
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		
		//static_method(); 
		//can call but can't call instance in static
	}
	
	public static void static_method() {
		//System.out.println("num1 :" + num1); 
		//num1 is instant data, cant access
		System.out.println("num2 :" + num2);
		//java_method obj = new java_method();
		//obj.instance_method();
	}
	public static void main(String[] args) {
		java_method obj = new java_method();
		obj.instance_method();
		
		static_method();
		//java_method.static_method();
	}
}
