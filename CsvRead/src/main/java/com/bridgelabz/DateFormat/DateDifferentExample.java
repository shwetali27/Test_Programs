package com.bridgelabz.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDifferentExample {

	public static void main(String[] args) {

		String dateStart = "2016-09-10";
		String dateStop = "2016-10-10";
		String nextDay =null;
		//HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date d1 = null;
		Date d2 = null;

		try {
			
			try {
				Calendar calender = Calendar.getInstance();
				calender.setTime(format.parse(dateStart));
				calender.add(Calendar.DATE, 4);
				nextDay = format.format(calender.getTime());
			} catch (ParseException e) {
				System.out.println(e);
			}
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			System.out.println(nextDay);
			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
