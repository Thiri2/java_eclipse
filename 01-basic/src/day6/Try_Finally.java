package day6;

import java.util.Scanner;

public class Try_Finally {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.println("Enter salary : ");
//			int salary = Integer.parseInt(sc.nextLine());
//			if(salary == 0 )
//				return;
//			System.out.println("Your salary is " + salary );
//		}
//		finally {
//			sc.close();
//			System.out.println("It is always executed");
//		}
		
		try {
			String name = null;
			System.out.println("Len : " + name.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("It doesnt allocate");
		} finally {
			System.out.println("always executed");
		}
		System.out.println("Outside try catch block");
	}
}
