package day7;

import java.util.Scanner;

public class TestingAssign3 {

	static void validMark(int mark) throws MarkEnteryExceptionAssign3 {
		if(mark < 0 || mark >100) {
			throw new MarkEnteryExceptionAssign3("Mark is not between 0 to 100");
		}
		else {
			System.out.println("Your mark is " + mark);
		}
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Enter your mark : ");
			int mark = sc.nextInt();
			validMark(mark);
		} catch (MarkEnteryExceptionAssign3 e) {
			System.err.println("Error : " + e.getMessage());
		}
		
	}
}
