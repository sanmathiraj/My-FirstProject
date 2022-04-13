package com.training.java;

import java.util.TreeSet;

public class CompDemo {

	public static void main(String[] args) {
		Employee e1=new Employee("Anitha",222);
		Employee e2=new Employee("shylababy",235);
		Employee e3=new Employee("Nakshathra",226);
		Employee e4=new Employee("Throna",215);
		Employee e5=new Employee("jadoo",242);
		Employee e6=new Employee("melodana",238);
		TreeSet tree5=new TreeSet();
		tree5.add(e1);
		tree5.add(e2);
		tree5.add(e3);
		tree5.add(e4);
		tree5.add(e5);
		tree5.add(e6);
		System.out.println(tree5);

	}

}
