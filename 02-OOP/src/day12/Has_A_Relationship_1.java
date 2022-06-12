package day12;

public class Has_A_Relationship_1 {

	public static void main(String[] args) {
		Author auth = new Author("Mya Than Tint", "Myaing");
		Book book1 = new Book("War and Peace", 6800, auth) ;
		
		System.out.println("---Information---");
		System.out.println("Book Name : " + book1.name);
		System.out.println("Book Price : " + book1.price);
		System.out.println("Author name : " + book1.author.name);
		System.out.println("Native Town : " + book1.author.nativeTown);
	}
}

class Author {
	String name;
	String nativeTown;
	
	Author(String name, String town) {
		this.name = name;
		this.nativeTown = town;
	}
}

class Book {
	String name;
	int price;
	Author author; //has a relationship
	
	Book(String name, int price, Author author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}
}
