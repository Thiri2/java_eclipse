package day3;

import java.util.Scanner;

public class Switch_eg1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ënter food name : ");
		String name = sc.nextLine();
		String category;
		
//		switch(name) {
//			case "burger" , "pizza", "sandwich": //multiple-value
//				category = "Fast Food";
//				break;
//			case "milk tea" , "yougurt":
//				category = "Dessert";
//				break;
//			case "mohinga" :
//				category = "Burmese Food";
//				break;
//			case "sushi" :
//				category = "Japanese Food";
//				break;
//			default :
//				category = "unknown";
//				
//		}
		
		//switch expression
		
//		category = switch(name) {
//			case "burger", "pizza", "sandwich" -> "Fast Food";
//			case "yougurt", "milk tea" -> "Dessert";
//			case "mohinga" -> "Burmese Food";
//			case "sushi" -> "Japanese Food"; 
//			default -> "unknown";
//		};
		
		category = switch(name) {
		case "burger", "pizza", "sandwich" -> {
			if(name.equals("pizza"))
				System.out.println(name + " is Italian food");
			yield "fast food";		
		}
		case "yougurt", "milk tea" -> {
			yield "Dessert";
		}
		case "mohinga" -> "Burmese Food";
		case "sushi" -> "Japanese Food";
		default -> "unknown";
		};

		System.out.println(name + " is " + category);
		sc.close();
	}
}
