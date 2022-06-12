package day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_1 {
	public static void main(String[] args) {
		//create obj
		LocalDate now = LocalDate.now();
		LocalDate date1 = LocalDate.of(2016, 10, 16);
		LocalDate date2 = LocalDate.parse("2016-10-16");
		
		System.out.println("Current date : " + now);
		LocalDate yesterday = now.minusDays(1);
		System.out.println("Yesterday : " + yesterday);
		System.out.println("Tomorrow : " + now.plusDays(1));
		
		System.out.println("Current year : " + now.getYear());
		System.out.println("Current month : " + now.getMonth());
		System.out.println("Current month int : " + now.getMonthValue());
		System.out.println("Day of weeks : " + now.getDayOfWeek());
		System.out.println("Day of months : " + now.getDayOfMonth());

		System.out.println(now + "is a leap year?" + now.isLeapYear());
		System.out.println(date1 + "is a leap year?" + now.isLeapYear());
		System.out.println(date1 + " is same to " + date2 + " : " + date1.equals(date2));
		
		
		//Local Time
		LocalTime currentTime = LocalTime.now();
		LocalTime time1 = LocalTime.of(11, 3, 45);
		LocalTime time2 = LocalTime.parse("04:30");
		
		System.out.println("Current Time : " + currentTime);
		System.out.println("Previous Time : " + currentTime.minusHours(1));
		System.out.println("Current Hours : " + currentTime.getHour());
		System.out.println("Current Min : " + currentTime.getMinute());
		
		
		//Local Date_Time
		LocalDateTime currentDate = LocalDateTime.now();
		System.out.println("Current date time : " + currentDate);
		
		
		
	}
}
