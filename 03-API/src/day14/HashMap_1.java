package day14;

import java.util.HashMap;
import java.util.Map;

public class HashMap_1 {

	public static void main(String[] args) {
		Map<String, String> foods = new HashMap<>();
		
		foods.put("Oranges", "Fruit");
		foods.put("Grapes", "Fruit");
		
		var another1 = Map.of("Mango", "Fruit", "Potato", "Vegetable");
		foods.putAll(another1);
		
		System.out.println(foods);
		
		var another2 = Map.ofEntries(
					Map.entry("Coffee", "Juice"),
					Map.entry("Milk Tea", "Juice")
				);
		
		foods.putAll(another2);
		
		foods.forEach((k,v) -> System.out.println(k + "=>" + v));
		foods.putIfAbsent("kiwi", "Fruit");
		
		System.out.println("After new items : " + foods);
		
//		System.out.println("Contain coffee : " + foods.containsKey("Coffee"));
//		System.out.println("Contain snack : " + foods.containsKey("Snack"));
//		
//		var keys = foods.keySet();
//		System.out.println("All keys : " + keys);
//		
//		var values = foods.values();
//		System.out.println("All values : " + values);
//		
//		foods.remove("Mango");
//		System.out.println("All keys : " + foods.keySet());
//		
//		foods.keySet().removeIf(k -> k.contains("Tea"));
//		System.out.println("After remove : " + foods);
//		
//		foods.values().removeIf(v -> v.equalsIgnoreCase("fruit"));
//		System.out.println("After remove : " + foods);
		
		foods.replace("Mango", "Pineapple");
		System.out.println("Replace : " + foods.get("Mango"));
		
		foods.compute("Coffee", (k,v) -> v.toUpperCase());
		System.out.println("[Coffee] : " + foods.get("Coffee"));
		
		foods.compute("Cake", (k,v) -> "Snack");
		System.out.println(foods);
		
		foods.computeIfAbsent("Oranges", k -> "Juice");
		System.out.println(foods);
		
		foods.computeIfAbsent("Banana", k -> "Fruit");
		System.out.println(foods);
		
		foods.computeIfPresent("Orange", (k,v) -> "Juice");
		System.out.println(foods);
		
		foods.computeIfPresent("Corn", (k,v) -> "Vegetable");
		System.out.println("[Corn]" + foods.get("Corn"));
	}
}