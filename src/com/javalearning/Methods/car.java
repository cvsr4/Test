package com.javalearning.Methods;

class vechile
{
	
	protected String b="inova";
	public void myvechile()
	{
		System.out.println("new car");
		}
	
}

public class car extends vechile {
	
	static String s = "sold car";
	public static void main(String[] args)
	{
	final String s1="waganor";	
		car Car=new car();
		
  Car.myvechile();
   
   System.out.println();
	
	System.out.println(s + "  is"  + " " + s1);
	
	
	}

}



//sold car is waganor new caris innova