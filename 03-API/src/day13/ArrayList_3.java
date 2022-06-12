package day13;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		var list = new ArrayList<Phone>();
		
		Phone p = new Phone("Samsung", 150000);
		list.add(p);
		list.add(new Phone("iPhone", 2000000));
		list.add(new Phone("Vivo", 120000));
		
		System.out.println(list);
		
		System.out.println("---For Each---");
		list.forEach(ph -> System.out.println("Brand : " + ph.band + " ,Price" + ph.price));
		
		System.out.println("----proce > 1300000-----");
		list.forEach(ph -> {
			if(ph.price > 1300000)
				System.out.println(ph);
		});
		
		var phone = list.get(0);
		System.out.println("[0] : " + phone);
	}
}

class Phone {
	String band;
	int price;
	
	Phone(String band, int price) {
		this.band = band;
		this.price = price;
	}

	@Override
	public String toString() {
		return "{band=" + band + ", price=" + price + "}";
	}
	
}