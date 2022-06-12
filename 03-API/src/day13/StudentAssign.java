package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentAssign {
	
	public static void main(String[] args) {
		String [] stuName = {"Yuki", "Kate", "John", "Oli", "Greg"};
		var list = new ArrayList<>(Arrays.asList(stuName));
		
		list.forEach((str) -> System.out.println(str));
		
		Collections.sort(list);
		System.out.println("Sort : " + list);
		
		int search = Collections.binarySearch(list, "John");
		System.out.println((search < 0)? "Not found" : "Found");
		System.out.println("position : " + search);
		
		if(list.contains("Suzy")) {
			System.out.println("Suzy is included in the list");
			System.out.println(list);
		}else {
			list.add("Suzy");
			System.out.println("After adding : " + list);
		}
		
		for(String name : list) {
			if(name.startsWith("K")) 
				System.out.println(name);
		}
		
		list.removeIf((str) -> str.endsWith("g"));
		System.out.println("Ends with g :" + list);
		
		list.clear();
		System.out.println(list);
		

	}
}
