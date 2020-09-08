package com.corejavalearning.Aabstract;

abstract class Vechile
{
	abstract void wheels();
	}

class Bike extends Vechile
{
	void wheels()
	{
		String a ="Bike is";
		String b= "a two wheler";
		System.out.println(a + b);
	}
}

class Car extends Vechile{
	
	void wheels()
	{
		System.out.println("Car is four wheeler");
		
	}
}
public class Testabstract {
	
	public static void main(String args[]) {
		
	
	Vechile v = new Car();
	
	Vechile v1=new Bike();
	
	Vechile vechile;
	
	vechile= new Bike();
	vechile.wheels();
	
	vechile =new Car();	
	vechile.wheels();
	
	
	//v.wheels();
	
	//Vechile b=new bike();
	//v1.wheels();
	}
             
}
