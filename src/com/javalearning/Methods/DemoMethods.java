package com.javalearning.Methods;

import com.javalearning.Getsetters.Libraray;

public class DemoMethods {
	
 
	public static void main(String[] args)
 {
	DemoMethods demomethods = new DemoMethods();
	 add(10,5);
	 Vinayak();
	 demomethods.sampath();
	 System.out.println(librarydetails());
}
	public static int add(int a,int b){
		   
	    int c=a+b;
	    System.out.println("Addition of two numbers:"+c);
	    Sub();
			return 0;
		}
	static String Vinayak()
	{
	System.out.println("vinayak");
	return null;
	}
	
	
	static int Sub() {
		int d=10,e=8,f;
		 f=d-e;
		 System.out.println("Sub of two numbers:"+f);
		 return f;
	}
	
	String sampath() {
		System.out.println("Reddy");
		return null;
		
	}
	
	static Libraray librarydetails() {
		Libraray library = new Libraray();
		return null;
		
	}
	
}
