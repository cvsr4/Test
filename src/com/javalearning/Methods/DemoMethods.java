package com.javalearning.Methods;

import com.corejavalearning.Enum.FreshJuice;
import com.javalearning.Getsetters.Libraray;
import com.javalearning.datatypes.Ddoctor;

public class DemoMethods {
	
 
	public static void main(String[] args)
 {
	DemoMethods demomethods = new DemoMethods();
	 add(10,5);
	 String result=Vinayak();
	 //demomethods.sampath();
	 System.out.println(demomethods.sampath());
	 //System.out.println(librarydetails());
	 //System.out.println(Vinayak());
	 System.out.println(result);
	// System.out.println(librarydet());
}
	public static int add(int a,int b){
		   
	    int c=a+b;
	    System.out.println("Addition of two numbers:"+c);
	    Sub();
			return 0;
		}
	static String Vinayak()
	{
	//System.out.println("vinayak");
	return "vinayakreddy";
	}
	
	
	static int Sub() {
		int d=10,e=8,f;
		 f=d-e;
		 System.out.println("Sub of two numbers:"+f);
		 return f;
	}
	
	String sampath() {
		System.out.println("Reddy");
		return "abc";
		
	}
	
	
	/*//ibrarydetails() {
		//Libraray library = new Libraray();
		//return library;
	
		//}
	
	//static Library librarydet() {
	Library libb=new Library();
		return libb;
	}
	
	Ddoctor ddoctor =new Ddoctor();
	/* The code below will print the words Hello World
	to the screen, and it is amazing */
	
	/*FreshJuice blngFreshJuice() {
		FreshJuice freshjuice = new FreshJuice();
		fj=
		return freshjuice;
	}*/
}
