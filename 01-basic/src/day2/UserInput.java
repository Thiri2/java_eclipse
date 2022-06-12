package day2;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*;

public class UserInput {
	
	public static void main(String[] args) throws IOException {
		//stream [carry info]
		//create 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//other operations
		System.out.print("Enter a name : ");
		String name = br.readLine();
		System.out.print("Enter salary : ");
		double salary = Double.parseDouble(br.readLine());
		System.out.print("Enter age : ");
		int age = Integer.parseInt(br.readLine());
		
		//close
		br.close();
		
		System.out.println("\nName : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Age : " + age);
	}
}
