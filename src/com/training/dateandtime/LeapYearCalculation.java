package com.training.dateandtime;

import java.time.Year;
import java.util.Scanner;

public class LeapYearCalculation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year value");
		int n=sc.nextInt();
		boolean y=Year.isLeap(n);
	if(y==true) {
		System.out.println(n+"is leap Year");

		}

    else
	{
		System.out.println(n+"is not a leap Year");
		sc.close();
	}
}

}