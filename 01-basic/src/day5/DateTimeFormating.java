package day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormating {
	public static void main(String[] args) {
		DateTimeFormatter date_format = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter time_format = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter date_time_format = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime date_time = LocalDateTime.now();
		
		System.out.println("format1 : " + date.format(date_format));
		System.out.println("format2 : " + time_format.format(time));
		System.out.println("format3 : " + date_time.format(date_time_format));
		
		//custom pattern
		System.out.println("-------Custom pattern-------");
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("E,MMM dd yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh-mm-ss");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MMMM dd yyyy 'at' h:m:ss");
		
		System.out.println("Default format : " + date );
		System.out.println("Custom format : " + f1.format(date));
		
		System.out.println("Default time : " + time);
		System.out.println("Custom time : " + time.format(f2));
		
		System.out.println("Defualt format : " + date_time);
		System.out.println("Custom date_time : " + f3.format(date_time));
		
		//localized pattern
		System.out.println("-------Using Localized Pattern------");
		DateTimeFormatter format_1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		System.out.println("Default format : " + date);
		//System.out.println("Localized format : " + date.format(format_1));
		
//		System.out.format("Custom form : %s\n", date.format(format_1));
//		System.out.format("Name : %s, Age : %d", "Su Su", 20);
		
		System.out.format("Long Format : %s\n", date.format(format_1));
		
		System.out.println("Full Format : " + 
				date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		
		System.out.println("Medium Format : " + 
				date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		
		System.out.println("Short Format : " + 
				date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
		
		
		
	}
}
