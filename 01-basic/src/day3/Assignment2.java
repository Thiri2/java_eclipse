package day3;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean in = true; 
		
		while(in) {
			System.out.println("When do you go to bed? ");
			int bed = sc.nextInt();
			System.out.println("When do you get up? ");
			int up = sc.nextInt();	
			up = up + 12;
					
			int diff = up-bed;
			System.out.println("Your sleep-time hour is " + diff);
			
			if(diff >= 5 && diff <=8)
				System.out.println("You take care of your health well!");
			else if(diff <=5) 
				System.out.println("You are very hardworking");
			else if(diff >=8)
				System.out.println("You are abnormal");	
			
			sc.nextLine();
			String input = "";
			System.out.println("Enter exit to quit and any letter to continue : ");
			input = sc.nextLine();
			
			if(input.equals("exit")) {
				System.out.println("Program end!");
				in = false;
			}
		}
		sc.close();
	}
}