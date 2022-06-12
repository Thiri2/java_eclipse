package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateList {

	public static void main(String[] args) {
		//datatype[] namw = new data[3];
		
		List<Integer> list1 = List.of();
		//list1.add(100); //UnsupportedOperationException
		List<Integer> list2 = List.of(100,200,300);
		Integer[] data = {1,2,3,4};
		List<Integer> list3 = Arrays.asList(data);
		//list3.add(100);
		
		//modified list
		List<String> list4 = new ArrayList<>();
		list4.add("Aung Aung");
		list4.add("Su Su");
		
		List<Integer> list5 = new ArrayList<>(Arrays.asList(data));
		list5.add(100);
	
		
		System.out.println("List1 : " + list1);
		System.out.println("List2 : " + list2);
		System.out.println("List3 : " + list3);
		System.out.println("List4 : " + list4);
		System.out.println("List5 : " + list5);
		
	}
}
  