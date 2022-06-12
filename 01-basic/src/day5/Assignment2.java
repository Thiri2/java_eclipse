package day5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] foods = {"Pizza", "Burger", "Milk Tea", "Spicy Noodle"};
		String [] townships = {"Bahan", "North Dagon", "Mayangon", "Botahtaung"};
		int [] times = {15,30,45,60};
		
		int noOfFood = foods.length;
		int deliTsp = townships.length;
		int item = 0, tsp=0, order=0;
		
		boolean incorrect = true;
		while(incorrect) {
			System.out.println("*****Available Menu*****");
			
			for(int i = 0; i < noOfFood; i++)
				System.out.println(i + " " + foods[i]);
			
			System.out.println("Please choose item : " );
			item = sc.nextInt();
			
			if(item > noOfFood || item < 0) {
				System.err.println("Please enter the item given!");
			}
			else {
				System.out.println("Next\n" + "You have chosen : " + foods[item]);
				incorrect = false;
			}
		}
		
		incorrect = true;
		while(incorrect) {
			System.out.println("*****Deliverable Township*****");
			
			for(int i = 0 ; i < deliTsp; i++)
				System.out.println(i + " " + townships[i] + "(" + times[i] + "mins" + ")");
			
			System.out.println("Please choose township : " );
			tsp = sc.nextInt();
			
			if(tsp > deliTsp || tsp < 0) {
				System.err.println("Please enter the township given!");
			}
			else {
				System.out.println("Next\n" + "You have chosen : " + townships[tsp] +  "(" + times[tsp] + "mins" + ")");
				incorrect = false;
			}
		}
		
		System.out.println("""
				*****Order Type*****
				1. Order Now?
				2. PreOrder?
				Please choose 1 or 2 :  """);
		
		order = sc.nextInt();
		
		if(order != 1 && order != 2) {
			System.err.println("Invalid number");
			order = sc.nextInt();
		}
		else {
			System.out.println("Order success!");
		}
		
		if(order==1) {
			System.out.println("\n****Your Order Information****");
			System.out.println("Item Name : " + foods[item]);
			System.out.println("Your Address : " + townships[tsp]);
			System.out.println("Duration : " + times[tsp]);
			LocalTime arrtime = LocalTime.now().plusMinutes(times[tsp]);
			System.out.println("Arrival Time : " + arrtime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
			System.out.println("*****Thank you for ordering*****");
		}
		else {
			LocalDate now = LocalDate.now();
			System.out.println("Enter deliver date (dd) : ");
			int date = sc.nextInt();
			LocalDate deliDate = LocalDate.of(now.getYear(), now.getMonth(), date);

			System.out.println("****Your Order Information****");
			System.out.println("Item Name : " + foods[item]);
			System.out.println("Your Address : " + townships[tsp]);
			System.out.println("Arrival Date : " + deliDate.format(DateTimeFormatter.ofPattern("EEEE, MMM dd yyyy")));
			System.out.println("*****Thank you for ordering*****");
		}
		sc.close();
	}
}
