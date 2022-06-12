package day6;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sent = sc.nextLine();
		
		boolean verify = sent.contains("?");
		if(verify) {
			System.out.println("It's a questions.");
			String[] arr = sent.split(" ");
			String first = arr[0];
			System.out.println("First word : " + first);
			if(first.equals("Do")) {
				System.out.println("It is in simple present tense.");
			}
			else {
				System.out.println("It's not in simple present tense.");
			}
		} else {
			System.out.println("It's a sentence.");
		}
		sc.close();
	}
}
