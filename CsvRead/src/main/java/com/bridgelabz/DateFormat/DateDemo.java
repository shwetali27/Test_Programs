package com.bridgelabz.DateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String args[]) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(dateFormat.format(new Date()));

		String dt = dateFormat.format(new Date());
		
		for (int i = 1; i < 5; i++) {
			Calendar c = Calendar.getInstance();
			c.setTime(dateFormat.parse(dt));
			c.add(Calendar.DATE, i); // number of days to add
			
			String dt2 = dateFormat.format(c.getTime()); // dt is now the new date

			System.out.println(dt2);
		}
	}
}