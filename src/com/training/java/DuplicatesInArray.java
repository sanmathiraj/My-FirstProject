package com.training.java;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
	    int[] array1=new int[]{1,5,2,4,5,8,2,5,4,6,5,8,2,3,4,8};
		System.out.println("Duplicates elements in given array:");
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1.length;j++) {
				if(array1[i]==array1[j])
				{System.out.println(array1[j]);
			}
		}
	}

}}
