package day2;

import java.io.*;

public class Practice1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter name : ");
		String name = br.readLine();
		System.out.print("Enter email : ");
		String email = br.readLine();
		System.out.print("Enter phone number : ");
		String phone = br.readLine();
		System.out.print("Enter education : ");
		String edu = br.readLine();
		System.out.print("Enter income : ");
		double income = Double.parseDouble(br.readLine());
		System.out.print("Enter age : ");
		int age = Integer.parseInt(br.readLine());
		
		br.close();
		
		System.out.println("_________Profile____________");
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Phone : " + phone);
		System.out.println("Education : " + edu);
		System.out.println("Income : " + income);
		System.out.println("Age : " + age);
		
		
		
	}
}
