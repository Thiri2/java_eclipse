package day10;

public class MethodOverriding {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.show();
		cat.sound();
		cat.display();
		cat.display("Sam");
	}
}

class Animal {
	void show() {
		System.out.println("This is show method");
	}
	void sound() {
		System.out.println("Some sound"); //overridden method
	}
}

class Cat extends Animal {
	
	@Override
	void sound() {
		System.out.println("meow : overriding method");
	}
	
	void display() {
		System.out.println("This is display with 0 parameter");
	}
	void display(String name) {
		System.out.println("This is display with 1 parameter");
	}
}