package day6;

public class Assignment1 {

	public static void main(String[] args) {
		String para = "NLP techniques are becoming widely popular scientific research areas as \r\n"
				+ "well as Information Technology industry. Language technology together with Information \r\n"
				+ "Technology can enhance the lives of people with different capabilities. This system \r\n"
				+ "implements voice command mobile phone dialer application. The strength of the system is \r\n"
				+ "that it can make phone call to the contact name written in either English scripts or Myanmar \r\n"
				+ "scripts.";
		
		int noOfWords = (para.split(" ").length);
		System.out.println("No of Words : " + noOfWords);
		
		String[] noOfSentence = (para.split("[.]+"));
		System.out.println("No of Sentences : " + noOfSentence.length);
		
		
	}
}
