package com.training.dateandtime;
import java.time.*;

public class ZoneID {

	public static void main(String[] args) {
		ZoneId zoneid=ZoneId.systemDefault();
		System.out.println("Current system ZoneID is  "+zoneid);
	}

}
