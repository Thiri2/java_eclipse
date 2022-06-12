package day13;

import java.util.List;

public class CollectionWithLambda {
	
	public static void main(String[] args) {
		List<String> list = List.of("HTML" , "CSS", "JAVASCRIPT", "PHP", "JAVA");
		
		for(String lists : list)
			System.out.println(lists);
		
		System.out.println("---wiht lambda----");
		list.forEach((lists) -> System.out.println(lists));
		
		System.out.println("------------------");
		list.forEach((str) -> {
			if(str.contains("JAVA")) 
				System.out.println(str);
		});
		
		int[] numbers = new int[3];
		numbers[0] = 100;
		System.out.println(numbers[0]);
		
		//List<Integer> data ;
		
//		int -> Integer
//		double -> Double
//		boolean -> Boolean
//		char -> Character
//		float -> Float
	}
}
