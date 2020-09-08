package com.javalearninng.methodoverloading;

public class Basiccalc extends Calculator
{
	@Override
	int add(int a,int b)
	{
		return a+b ;
		
	}
	
	//class childcalc extends Basiccalc
	//{
		
	//}

	public static void main(String[] args) {
		 Basiccalc cal =new  Basiccalc();
		System.out.println("Two numbers" +cal.add(5, 10));
		Calculator cal1 =new Calculator();
		System.out.println("Two numbers" +cal1.add(5, 10));
		Calculator cal2=new  Basiccalc();
		System.out.println("Two numbers" +cal2.add(5, 10,1));
		
	}

}
// Interfaces
