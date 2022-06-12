package day3;

import java.util.Scanner;

public class ConditionalStatemenet {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter email : ");
//		String email = sc.nextLine();
//		System.out.print("Enter password : ");
//		String pw = sc.nextLine();
//		
//		if(email.equals("admin@gmail.com") && pw.equals("admin")) {
//			System.out.println("Login Sucess");
//		}
//		else {
//			System.out.println("Invalid Login");
//		}
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter bmi value : ");
		float bmi = Float.parseFloat(sc.nextLine());
		
		if(bmi < 18.5)
			System.out.println("Underweight");
		else if(bmi >= 18.5 && bmi <= 24.9)
			System.out.println("Normal Weight");
		else if (bmi >= 25 && bmi <= 29.9)
			System.out.println("Overweight");
		else 
			System.out.println("Obesity");
		
		sc.close();
		
	}

}
