package com.training.dateandtime;
import java.time.*;
import java.util.Scanner;

public class PeriodCalculation {
	
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you Date of Birth in yyyy-mm-dd format");
		String input=sc.next();
		sc.close();
		
		LocalDate Birthday=LocalDate.parse(input);
		System.out.println("you are  "+calculateAge(Birthday)+"  years old ");

	}

	public static int calculateAge(LocalDate Birthday) {
		LocalDate today=LocalDate.now();
		if((Birthday!=null)&&(today!=null)) {
			return Period.between(Birthday, today).getYears();
		}
			else {
				return 0;
	
		}
	}
	}

	


