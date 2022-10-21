package com.simple.demo2;

public class Equals {

	public static void main(String[] args) {
	String name1 = new String("Program");
	String name2 = name1;
	
	System.out.println("Check if two strimgs are equal");
	 
	boolean result1 = (name1 == name2);
	System.out.println("Using == operator:" + result1);
	
	boolean result2 = name1.equals(name2);
	System.out.println("Using equals():" + result2);

	}
}
