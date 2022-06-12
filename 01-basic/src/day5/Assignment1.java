package day5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Assignment1 {
	public static void main(String[] args) {
		
		//LocalDate date1 = LocalDate.of(2016, 10, 16);
		String [] weekdays = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("EEEE, MMM dd yyyy");
		LocalDate now = LocalDate.now();
		//System.out.println(date1.format(f1));
		System.out.println("Current date : " + now.format(f1));
		System.out.println("***********************************");
		
		DayOfWeek dayOfWeek =  now.getDayOfWeek();
		if(Arrays.binarySearch(weekdays, dayOfWeek.name()) < 0 ) {
			System.out.println("Today is my holiday");
		}
		else {
			System.out.println("I have no time. I am studying Programming");
		}
		
		
	}
}
