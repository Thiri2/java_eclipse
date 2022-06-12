package day7;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Boolean excep = true;
		while(excep) {
		try {
			String [] division = {"Kachin" , "Kayah", "Kayin", "Chin", "Sagaing", "Tanintharyi", 
					"Bago", "Magway", "Mandalay", "Mon", "Rakhine", "Yagon", "Shan", "Ayeyawaddy", "Nay Pyi Taw"};
			System.out.println("Enter your NRC : ");
			String nrc = new String (sc.nextLine());
			
			int one = nrc.indexOf("/");
			int two = nrc.indexOf("(");
			int three = nrc.indexOf(")");
			int div = Integer.parseInt(nrc.substring(0, one));

			System.out.println("Division : " + division[div-1]);
			System.out.println("City : " + nrc.substring(one+1 , two));
			System.out.println("Number : " + nrc.substring(three+1));
			excep = false;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}
	}
		sc.close();
	}
}
