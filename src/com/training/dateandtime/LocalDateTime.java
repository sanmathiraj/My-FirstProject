package com.training.dateandtime;
import java.time.*;

public class LocalDateTime {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println("Today is "+date);
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		System.out.println(dd+"-"+mm+"-"+yy);
		 
		LocalTime Time=LocalTime.now();
		int h=Time.getHour();
		int m=Time.getMinute();
		int s=Time.getSecond();
		int n=Time.getNano();
		
		
		System.out.println("The time is  "+h+":"+m+":"+s+":"+n);
		System.out.println("After six month:  "+date.plusMonths(6));
		System.out.println("Before six month: "+date.minusMonths(6));
		  
		
	}

}
