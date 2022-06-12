package day3;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totnum , num, positive = 0, negative = 0 ,zero = 0 ;
		
		System.out.println("How many number you want to type : ");
		totnum = sc.nextInt();
		
		for(var i = 0; i < totnum; i++) {
			System.out.println("Enter any number : ");
			num = sc.nextInt();
			
	        if (num > 0)
	            positive++;
	        else if (num < 0)
	            negative++;
	        else 
	            zero++;

		}
			System.out.println("\nNumber of zero : " + zero);
			System.out.println("Number of positive : " + positive);
			System.out.println("Number of negative : " + negative);
			
			sc.close();
	}
	
	
}
