package day11;

import java.util.Arrays;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println("100 + 200 = " + Addition.add(100, 200));
		
		System.out.println("2.3 + 5.4 = " + Addition.add(2.3f, 5.4f));
		
		System.out.println("Hello + World = " + Addition.add("Hello", "World"));
		
		System.out.println("int array's sum = " + Addition.add(new int[] {10,20,30,40}));
	}
}

class Addition {
	static int add(int a,int b) {
		return (a+b);
	}
	static float add(float a,float b) {
		return (a+b);
	}
	static String add(String a , String b) {
		return (a+b);
	}
	static int add(int[] input) {
		return Arrays.stream(input).sum();
	}
}