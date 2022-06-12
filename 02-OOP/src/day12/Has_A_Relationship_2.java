package day12;

import java.time.LocalDate;

public class Has_A_Relationship_2 {

	public static void main(String[] args) {
		SalesRecord[] records = new SalesRecord[3];
		
		Product prod1 = new Product("Coffee", 1500);
		Product prod2 = new Product("Drink", 1000);
		
		records[0] = new SalesRecord(1001, 2, prod1);
		records[1] = new SalesRecord(1002, 3, prod2);
		records[2] = new SalesRecord(1003, 6, prod1);
		
		System.out.println("No.\tSale Date\tProduct\tPrice\tQty\tSubTotal");
		
		for(var sale : records) 
			sale.display();
	}
}

class Product {
	String name;
	int price;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class SalesRecord {
	int id;
	int saleQty;
	LocalDate saleDate;
	Product product;
	public SalesRecord(int id, int qty, Product prod) {
		this.id = id;
		this.saleQty = qty;
		this.saleDate = LocalDate.now();
		this.product = prod;
	}
	
	void display() {
		System.out.print(id + "\t" + saleDate + "\t");
		System.out.print(product.name + "\t" + product.price + "\t");
		System.out.print(saleQty + "\t" + (saleQty * product.price));
		System.out.println();

	}
}