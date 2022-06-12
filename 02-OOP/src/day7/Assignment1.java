package day7;

import java.util.Scanner;

class AcceptArray {
	private String [] Snums = new String [10];
	int n;
	
	public AcceptArray(String[] snums, int n) {
		super();
		Snums = snums;
		this.n = n;
	}
}


public class Assignment1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to store : ");
		int n = sc.nextInt();
		
		String [] Snums = new String [10];
		int [] Anums = new int[n];
		System.out.println("Enter the numbers : ");
		for(int i = 0; i < Snums.length; i++) {
			Anums[i] = Integer.parseInt(Snums[i]);
			System.out.println(Anums[i]);
	}
	}
}

