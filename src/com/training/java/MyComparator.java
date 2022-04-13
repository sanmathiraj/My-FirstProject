package com.training.java;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator{
	Employee m1=new Employee("bbb",222);
	Employee m2=new Employee("ddddd",235);
	Employee m3=new Employee("xfesdff",226);
	Employee m4=new Employee("eeeee",215);
	Employee m5=new Employee("ggggg",242);
	Employee m6=new Employee("aaaa",238);
	TreeSet tree4=new TreeSet(new MyComparator());{
	tree4.add(m1);
	tree4.add(m2);
	tree4.add(m3);
	tree4.add(m4);
	tree4.add(m5);
	tree4.add(m6);
	System.out.println(tree4);
	}
	@Override
	public int compare(Object o1, Object o2) {
	Employee m1=(Employee)o1;
	Employee m2=(Employee)o2;
	String s1=m1.Ename;
	String s2=m2.Ename;
	 {
		return s1.compareTo(s2);
	}
	

}
}