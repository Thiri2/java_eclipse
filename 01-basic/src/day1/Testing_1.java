package day1;

public class Testing_1 {
	int rno;
	static float bonus;
	void display() {
//		int barCode;
		int barCode = 1001;
		String name = "Coffee";
		
		System.out.println("Barcode : " + barCode);
		System.out.println("Name : " + name);
		
		var price = "Su Su"; //cant just initialize nth
	}
	void addNumber(int a,int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}
	public static void main(String[] args) {
		{
			Testing_1 obj = new Testing_1();
			
			
			
			String shopName = "Moonpie";
			System.out.println("Shop Name : " + shopName);
		}
//		System.out.println("Shop name : " + shopName);
//		can't access this
	}
}
