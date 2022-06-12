package day14;

import java.util.TreeMap;

public class TreeMap_1 {
	public static void main(String[] args) {
		var file_exetensions = new TreeMap<>();
		
		file_exetensions.put("java", ".Java");
		file_exetensions.put("php", ".php");
		file_exetensions.put("c++", ".cpp");
		file_exetensions.put("html", ".html");
		file_exetensions.put("javascripte", ".js");
		
		System.out.println(file_exetensions);
		
		file_exetensions.remove("c++");
		System.out.println(file_exetensions);
	}
}
