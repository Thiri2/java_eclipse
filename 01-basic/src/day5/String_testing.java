package day5;

import java.time.LocalDate;
import java.util.Arrays;

public class String_testing {
	public static void main(String[] args) {
		String s1 = new String(new char[] {'Y', 'W', 'K'});
		String s2 = new String("Java Programming");
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("length of s1 : " + s1.length());
		
		//change case
		String s3 = s2.toLowerCase();
		System.out.println("After : " + s2);
		System.out.println("s3 : " + s3);
		s1 = s1.toLowerCase();
		System.out.println("s1 : " + s1);
		
		String substr = s2.substring(0,4);
		System.out.println("Substring : " + substr);
		System.out.println("Substring : " + s2.substring(7));
		
		//replace
		String result = s2.replace("Java", "php");
		System.out.println("Result : " + result);
		System.out.println("Original : " + s2);
		
		//concat
		result = s2.concat(" Language");
		System.out.println("Concat : " + result);
		
		//finding
		System.out.println("Contain Java : " + s2.contains("Java"));
		System.out.println("Contain abc : " + s2.contains("abc"));
		System.out.println("Start with abc : " + s2.startsWith("abc"));
		System.out.println("End with 'ing' : " + s2.endsWith("ing"));
		
		//location
		//int index = s2.indexOf("a");
		System.out.println("index of a : " + s2.indexOf("a"));
		System.out.println("index of a : " + s2.lastIndexOf("a"));
		System.out.println("index of abc : " + s2.indexOf("abc"));
		
		//split
		String[] data = s2.split(" ");
		System.out.println("Splitting data: " +  Arrays.toString(data));
		char[] characters = s2.toCharArray();
		System.out.println("Char array data : " + Arrays.toString(characters));
		
		String rs = String.copyValueOf(characters);
		System.out.println("rs : " + rs);
		System.out.println("String from boolean : " + String.valueOf(true));
		System.out.println("String from int : " + String.valueOf(100));
		System.out.println("String from localdate : " + String.valueOf(LocalDate.now()));
	}

}
