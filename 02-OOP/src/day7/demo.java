package day7;

public class demo {
	public static void main(String[] args) {
		
		Phone p1 = new Phone("iPhone", "pink", 1800000);
		Phone p2 = new Phone("Samsung", "purple", 100000);
		var p3 = new Phone("Vivo", "black", 200000);
		
		System.out.println("-----Phone 1 data------");
		System.out.println("Brand : " + p1.brand + ",Color : " + p1.color + ",Price : " + p1.price);
		p1.call();
		p1.sendSms();
		System.out.println("-----Phone 2 data------");
		System.out.format("Brand: %s, Color: %s, Price: %d\n", p2.brand, p2.color, p2.price);
		System.out.println("-----Phone 3 data------");
		System.out.format("Brand: %s, Color: %s, Price: %d\n", p3.brand, p3.color, p3.price);
	}
}