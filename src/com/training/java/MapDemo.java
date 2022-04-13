package com.training.java;

import java.io.Serializable;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> h1=new HashMap<String, Integer>();
		HashMap<String, Integer> h2=new HashMap<String, Integer>();
		h1.put("Java", 101);
		h1.put("Software", 102);
		h1.put("Testing", 105);
		h2.put("Java", 101);
		h2.put("Software", 102);
		h2.put("Testing", 105);
		h2.put("Operating system", 106);
		h2.put("Graphics", 107);
		h1.put("Operating system", 106);
		h1.put("Graphics", 107);
		System.out.println("The elements of Map is "+h1);
		System.out.println(h1.containsValue(108));
		System.out.println(h1.containsKey("Os"));
        System.out.println(h2.entrySet().equals(h1.entrySet()));
        System.out.println(h1.keySet());
        System.out.println(h2.values());
	}

}
