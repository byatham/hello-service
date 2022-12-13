package com.anu.tech.util;

import java.time.LocalDateTime;
@FunctionalInterface
public interface MessageUtility {
	
	void info();
	
	public static String getWishMessage()
	{
		int hour = LocalDateTime.now().getHour();
		
		if(hour<12)
		return "Good Morning --> :: Current Date&Time is -->"+ LocalDateTime.now();
		else if(hour>12&&hour<16)
		return "Good Afternoon --> :: Current Date&Time is --> "+ LocalDateTime.now();
		return "Good Evening --> :: Current Date&Time is --> "+ LocalDateTime.now();
	}

}
