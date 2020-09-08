package com.javalearninng.methodoverloading;
//compile time 
public class Calculator {

	int add(int a,int b)
	{
		return a+b+1 ;
		
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		Calculator cal =new Calculator();
		System.out.println("Two numbers" +cal.add(5, 10));
        System.out.println("thre numbers"+cal.add(5, 10, 10));
       //System.out.println(cal.add(5,10,5,2));  compile time poly example
	}
	
}
