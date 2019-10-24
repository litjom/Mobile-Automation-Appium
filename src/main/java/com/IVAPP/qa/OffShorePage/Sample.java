package com.IVAPP.qa.OffShorePage;

import java.util.Calendar;
import java.util.Date;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.DATE, -7);
//		System.out.println("Date = "+ cal.getTime());
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());

		// substract 7 days
		// If we give 7 there it will give 8 days back
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH)-6);

		// convert to date
		Date myDate = cal.getTime();
		System.out.println(myDate);
		
		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
//		   LocalDateTime now = LocalDateTime.now();  
//		   System.out.println(dtf.format(now));
		
	}

}
