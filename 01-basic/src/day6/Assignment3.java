package day6;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your NRC number : ");
		String nrc = new String (sc.nextLine());
		int one = nrc.indexOf("/");
		int two = nrc.indexOf("(");
		int three = nrc.indexOf(")");
		
		System.out.println("Your NRC : " + nrc);
		System.out.println("Township : " + nrc.substring(one+1, two));
		System.out.println("Number : " + nrc.substring(three+1));
		
		sc.close();
	}
}
