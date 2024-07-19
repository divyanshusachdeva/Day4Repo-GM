package com.graymatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DemoOnDateAndTime {

	public static void main(String[] args)  {

//		Date date = new Date("07/18/2024");
//		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		
		Date date1 = new Date("18-JUL-2024");
		System.out.println(date1);
		
		// Converting the string to date format using parse()
		
		String myDate = "18-JUL-2024";
		//date = sdf.parse(myDate);
		System.out.println(myDate);

		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		date = LocalDate.of(2024, 7, 18);
		System.out.println(date);
		
		
		String pattern = "2024-07-18";
		
		date = LocalDate.parse(pattern);
		System.out.println(date);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		myDate = date.format(formatter);
		System.out.println(myDate);

		LocalTime time = LocalTime.now();
		System.out.println("Local Time :" +time);
		
		LocalTime time2 = LocalTime.MIDNIGHT;
		System.out.println(time2);
		
		
		System.out.println(date.getDayOfWeek()); // Day of week (Thursday)
		System.out.println(date.getDayOfMonth()); // Day of Month (18)
		System.out.println(date.getDayOfYear()); // Day of year (200th day of year)
		
		System.out.println(time.getHour()); // Hour - 11
		System.out.println(time.getMinute()); // Minute - 23
		
		String myJoining = "2022-03-22";
		LocalDate doj = LocalDate.parse(myJoining);
		
		String myLeaving = "2024-07-18";
		LocalDate dol = LocalDate.parse(myLeaving);

		Period p = Period.between(doj, dol);
		System.out.println(p);
		
		System.out.println("Total time worked: " + p.getYears() + "years, " + p.getMonths() + "months, " + p.getDays() + "days.");
		
			
		
	}

}
